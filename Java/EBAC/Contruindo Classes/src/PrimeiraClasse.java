public class PrimeiraClasse {
    public static  void  main(String args[]){

        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua quinze");
        cliente.setCodigo(1);
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCodigo());
    }
}
