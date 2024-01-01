package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>(); 
        notas.put("Gil1", 10);
        notas.put("Gil2", 11);
        notas.put("Gil3", 12);

        // var nota = notas.get("Gil2");
        // System.out.println(nota);

        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é: " + key + " e o valor é: " + value);
        }
    }

}
