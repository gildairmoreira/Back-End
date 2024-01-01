package pessoa;

public class Pessoa {
    // nome, idade, cpf
    // tipo nomeDaVariavel

    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa() {
        return "O nome da pessoa é:" + nome + " A idade é " + idade + " E o documento é: " + cpf;
    }
}
