package estudos;

public class Agencia {
    private String nome;
    private int numero;
    private int digito;

    public Agencia(String n, int u, int d) {
        
        nome = n;
        numero = u;
        digito = d;
        
        }
        public String getNome() {
        return nome;
        }
        public int getNumero() {
        return numero;
        }
        public int getDigito() {
        return digito;
        }
 
    public void setNome(String n){
        nome = n;    
        }
    public void setNumero(int u){
        numero = u;
        }
    public void setDigito(int d){
        digito = d;
    }   

    public String toString() {
    return "Agência: Número=" + numero + ", Dígito=" + digito + ", Nome=" + nome +"\n";
    }
}