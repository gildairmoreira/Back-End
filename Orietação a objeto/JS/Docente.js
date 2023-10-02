import User from "./User.js";

class Docente extends User
{
  constructor(nome, email, nascimento, role = 'docente', ativo = true)
  {
    super(nome, email, nascimento, role, ativo)
  }

  aprovaEstudante(estudante,curso)
  {
    return `estudante ${estudante} aprovado no curso de ${curso}`
  }
}
const novoDocente = new Docente('Joao', 'JJ@.com', '2021/55/05');

console.log(novoDocente)
console.log(novoDocente.exibirInfos)
console.log(novoDocente.aprovaEstudante('Sabrina', 'TS'))