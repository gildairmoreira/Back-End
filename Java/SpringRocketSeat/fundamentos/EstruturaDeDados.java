import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
     public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Gil1");
        nomes.add("Gil2");
        nomes.add("Gil3");

        // System.out.println(nomes.get(0));

        // for (String nome : nomes) {
        //     System.out.println("o nome e: " + nome);
        // }
        nomes.forEach(nome -> System.out.println("nome é " + nome));
     }
}