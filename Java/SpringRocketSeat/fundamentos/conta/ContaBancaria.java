package conta;

public class ContaBancaria {
    

    private String numero;
    private String titular;
    private double saldo;


    //constructor(Quando a classe e invocada ela executa primeiro o constructor para fazer algo antes dos metodos get set)
    public ContaBancaria(){
        saldo = 0;
    }

    //GETTERS AND SETTERS

    //Numero
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Saldo
    

    //METODOS

    //deposita
    void depositar(double valor) {
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Deposito de R$: " + valor + " Saldo atual de R$: " + saldo);
        }else{
            System.out.println("O valor de Depósito é inválido");
        }
    } 

    //sacar

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$:"+valor+ ". Saldo atual R$:"+saldo);
        }
    }

}
