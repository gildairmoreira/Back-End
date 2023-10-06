import livro from "../models/Livro.js";

class LivroController
{

  static async ListarLivros(req, res)
  {
    const listalivros = await livro.find({})
    res.status(200).json(listalivros)
  }

  static async CadastrarLivro(req, res)
  {
    try
    {
      const novoLivro = await livro.create(req.body)
      res.status(201).json({ message: "Criado com sucesso", Livro: novoLivro })
    } catch (erro)
    {
      res.status(500).json({ message: `${erro.message} - Falha ao Cadatrar Livro` })
    }
  }
}



export default LivroController