const user = {
  nome:"Gildair",
  email: "j@j.com",
  nascimento: "2021/01/04",
  role:"admin",
  ativo: true,
  exibirInfos:function () {
    console.log(this.nome, this.email)
  }
}
const admin = {
  nome:"maria",
  email: "m@m.com",
  role:"admin",
  criaCurso:function () {
    console.log('curso criado')
  }
}

Object.setPrototypeOf(admin,user)
admin.criaCurso()
admin.exibirInfos()