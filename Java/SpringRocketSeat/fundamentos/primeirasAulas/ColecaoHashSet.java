package primeirasAulas;
import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        
        
        //numeros.remove(12);
        // System.out.println(numeros.size());
        // for(Integer elemento: numeros){
        //     System.out.println(elemento);
        // }

        System.out.println(numeros.contains(15)); //Ver se tem tal coisa no Array e returna true or false

    }
}
