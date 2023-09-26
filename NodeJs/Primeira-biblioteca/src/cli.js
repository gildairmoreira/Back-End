import chalk from "chalk";
import pegaArquivo from "./index.js";
import fs from 'fs';


const caminho = process.argv;


async function processaTexto (argumentos) {
  
  if (fs.lstatSync(caminho).isFile()) {
    const caminho = argumentos[2]
    const resultado = await pegaArquivo(argumentos[ 2 ]);
    console.log(chalk.yellow('lista de links'),resultado)
    
  } else if (fs.lstatSync(caminho).isDirectory()){
    const arquivos = await fs.promises.readdir(caminho);
    arquivos.forEach((nomeDeArquivo) => {
      const lista = pegaArquivo(`${caminho}/${nomeDeArquivo}`)
      console.log(lista) 
    })
  }
}

processaTexto(caminho)