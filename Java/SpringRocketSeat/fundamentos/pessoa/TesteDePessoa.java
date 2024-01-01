package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("3332221");
        professor.setNome("Gildair");
        professor.setIdade(21);
        professor.setSalario(50000);
        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("146240666188");
        aluno.setNome("jobisclaudo");
        aluno.setIdade(26);
        aluno.setMatricula("489485");
        System.out.println(aluno.imprimirDadosDaPessoa());

    }
}
