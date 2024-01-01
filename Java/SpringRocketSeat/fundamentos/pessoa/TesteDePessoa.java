package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "3332221";
        pessoa1.nome = "Gildair";
        pessoa1.idade = 21;

        System.out.println(pessoa1.imprimirDadosDaPessoa());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "15648645";
        pessoa2.nome = "Maria";
        pessoa2.idade = 45;

        System.out.println(pessoa2.imprimirDadosDaPessoa());
    }
}
