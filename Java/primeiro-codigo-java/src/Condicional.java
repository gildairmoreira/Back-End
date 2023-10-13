public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão assistindo");
        }else {
            System.out.println("Filme retrô Que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus") ){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }
    }
}
