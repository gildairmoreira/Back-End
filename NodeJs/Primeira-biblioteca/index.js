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
}


//assync/await
async function pegaArquivo(caminhoDoArquivo)
{
  try
  {
    const encoding = 'utf8';
    const texto = await fs.promises.readFile(caminhoDoArquivo, encoding)
    console.log(chalk.green(texto))

  } catch (erro)
  {
    trataErro(erro)
  }


}

/* //promeses com then
function pegaArquivo(caminhoDoArquivo)
{
  const encoding = 'utf8';
  fs.promises
    .readFile(caminhoDoArquivo, encoding)
    .then((texto) => console.log(chalk.green(texto)))
    .catch(trataErro)
} */

/* function pegaArquivo(caminhoDoArquivo)
{
  const encoding = 'utf8';
  fs.readFileSync(caminhoDoArquivo, encoding, (erro, texto) =>
  {

    if (erro)
    {
      trataErro(erro)
    }
    console.log(chalk.green(texto))

  });
}
 */
pegaArquivo('./arquivos/texto.md');
pegaArquivo('./arquivos/');

// \(https?:\/\/[^\s?#.].[^\s]*\)