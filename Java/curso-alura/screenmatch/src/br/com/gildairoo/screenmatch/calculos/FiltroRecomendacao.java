package br.com.gildairoo.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os Preferidos do Momento");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito Bem Avaliado No momento!");
        }else{
            System.out.println("Coloque na sua Lista Para Assitir Depois");
        }
    }
}
