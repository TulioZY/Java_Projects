public class CaixaEletronico {
    public static void main(String args[]){
        Agencia A1 = new Agencia("Bradesco", 7890, 5);
        ContaCorrente CC1 = new ContaCorrente(1234, 4, A1, 150);
        Cliente C1 = new Cliente("Ademar Apior", "123231518-12", CC1);

        CC1.Sacar(140);
        System.out.println(CC1.getSaldo());
        CC1.Sacar(200);
        System.out.println(CC1.getSaldo());
        CC1.Deposito(25.45);
        System.out.println(CC1.getSaldo());
    }

}
