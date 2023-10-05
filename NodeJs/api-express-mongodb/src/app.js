import express from 'express';
import conectaNaDataBase from './config/dbConnect.js';
import livro from './models/Livro.js';


const conexao = await conectaNaDataBase()

conexao.on("error", (erro) => {
  console.error("Erro de Conexão", erro);
})

conexao.once("open", () => {
  console.log("Conexão feita com sucesso")
})


const app = express();
app.use(express.json())




app.get('/', (req, res) =>
{
  res.status(200).send('Cueso de nodeJS')
})

app.get('/livros', async (req, res) =>
{
  const listalivros = await livro.find({})
  res.status(200).json(listalivros)
})

app.get('/livros/:id', (req, res) =>
{
 const index = buscaLivros(req.params.id)
 res.status(200).json(livros[index])
})

app.post('/livros', (req, res) =>{
  livros.push(req.body)
  res.status(201).send('livro cadastrado com sucesso')
})

app.put("/livros/:id", (req,res) =>{
  const index = buscaLivros(req.params.id)
  livros[index].titulo = req.body.titulo
  res.status(200).json(livros)
})

app.delete("/livros/:id", (req,res) => {
  const index = buscaLivros(req.params.id)
  livros.splice(index, 1)
  res.status(200).send('livro removido Com sucesso')
})


export default app

