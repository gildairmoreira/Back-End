import http from 'http'

const PORT = 3000

const serve = http.createServer((req, res) => {
  res.writeHead(200, {"Content-Type": "text/plain"})
  res.end("Curso de Nodes.js")
})

serve.listen(PORT, () => {
  console.log("Server listening on")
})