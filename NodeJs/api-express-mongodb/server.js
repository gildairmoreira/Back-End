import http from 'http'

const PORT = 3000
const rotas = {
  "/": "Curso De Node.JS",
  "/livros": "Curso De livros.JS",
  "/autores": "Curso De autor.JS",
}

const serve = http.createServer((req, res) => {
  res.writeHead(200, {"Content-Type": "text/plain"})
  res.end(rotas[req.url])
})

serve.listen(PORT, () => {
  console.log("Server listening on")
})