import fs from 'fs';
import chalk from 'chalk';

function trataErro(erro)
{
  console.log(erro)
  throw new Error(chalk.red(erro.code, 'Não Há arquivo no diretorio'))
}

function extraiLinks(texto)
{
  const regex = /\[([^[\]]*?)\]\((https?:\/\/[^\s?#.].[^\s]*)\)/gm;
  const capturas = [ ...texto.matchAll(regex) ]
  const resultados = capturas.map(captura =>
  ({
    [ captura[ 1 ] ]:
      [ captura[ 2 ] ]
  }))
  return resultados.length !== 0 ? resultados : 'não há textos no arquivo'
}

//assync/await
async function pegaArquivo(caminhoDoArquivo)
{
  try
  {
    const encoding = 'utf8';
    const texto = await fs.promises.readFile(caminhoDoArquivo, encoding)
    return extraiLinks(texto)

  } catch (erro)
  {
    trataErro(erro)
  }


}

export default pegaArquivo;