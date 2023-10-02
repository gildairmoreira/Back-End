import User from "./User.js";

class Admin extends User
{
  constructor(nome, email, nascimento, role = 'admin', ativo = true) {
    super(nome, email, nascimento, role, ativo)
  }

  criarCurso (nomeDoCurso,vagas) {
    return `Curso de ${nomeDoCurso} criado com ${vagas} vagas`
  }
}
const novoAdmin = new Admin('gildair','gil@.com', '2021/05/05');
console.log(novoAdmin.criarCurso('typescript',100))