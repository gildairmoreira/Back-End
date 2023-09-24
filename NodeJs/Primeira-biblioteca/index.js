import fs from 'fs';
import chalk from 'chalk';

function trataErro(erro)
{
  console.log(erro)
  throw new Error(chalk.red(erro.code, 'Não Há arquivo no diretorio'))
}

function pegaArquivo(caminhoDoArquivo)
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

pegaArquivo('./arquivos/texto.md');