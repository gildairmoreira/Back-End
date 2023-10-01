function User(nome,email) {
  this.nome = nome,
  this.email = email

  this.exibirInfos = () => {
    return `${this.nome} ${this.email}`
  }
}

//const novoUser = new User('GILDAIR', 'gildair@g.com')
//console.log(novoUser.exibirInfos())


function Admin(role) {
  User.call(this, 'GILDAIR', 'gildair@g.com')
  this.role = role || 'estudante'
}

Admin.prototype = Object.create(User.prototype)
const novoUser = new Admin('admin')
console.log(novoUser.exibirInfos())
console.log(novoUser.role)