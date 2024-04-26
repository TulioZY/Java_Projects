public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int num, int dig, Agencia ag, double sal) {
        numero = num;
        digito = dig;
        agencia = ag;
        saldo = sal;
    }
    public int getNumero() {
        return numero;
    }
    public int getDigito() {
        return digito;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumero(int num) {
        numero = num;
    }
    public void setDigito(int dig) {
        digito = dig;
    }
    public void setAgencia(int ag) {
        agencia = ag;
    }
    public void setSaldo(double sal) {
        saldo = sal;
    }
    public void Deposito(double dep){
        saldo = saldo + dep;
    }
    public void Sacar(double sac){
        if (sac < saldo){
            saldo = saldo - sac;
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void consultarSaldo(String conS){
        System.out.println("Conta: "+ numero + "Dígito: " + digito + "Agência: "+ agencia);
        System.out.println("Saldo da conta: "+ saldo);
    }
}
