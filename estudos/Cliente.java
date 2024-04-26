public class Cliente {
    private String nome;
    private String cpf;
    private ContaCorrente conta;

    public Cliente(String n, String c, ContaCorrente cc) {
        nome = n;
        cpf = c;
        conta = cc;
    }
    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
    public double getConta() {
        return conta;
    }
    public void setNome(String n) {
        nome = n;
    }
    public void setCpf(int c) {
        cpf = c;
    }
    public void setConta(int cc) {
        conta = cc;
    }
}
