import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("Digite a Primeira Nota: ");
            int nota1 = inputScanner.nextInt();

            System.out.println("Digite a Segunda Nota: ");
            int nota2 = inputScanner.nextInt();

            System.out.println("Digite a Terceira Nota: ");
            int nota3 = inputScanner.nextInt();

            System.out.println("Digite a Quarta Nota: ");
            int nota4 = inputScanner.nextInt();

            long soma = (nota1 + nota2 + nota3 + nota4) / 4;
            if (soma >= 7) {
                System.out.println("Você foi aprovado!!!");
            } else if (soma >= 5) {
                System.out.println("Você ficou de Recuperação!!!");
            } else {
                System.out.println("Você foi Reprovado!!!");
            }
        }

    }
}