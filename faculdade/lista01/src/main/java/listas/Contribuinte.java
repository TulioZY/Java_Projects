package listas;

public class Contribuinte {
    private int idade;
    private char sexo; // 'M' ou 'F'
    private int tempoContribuicao; // em anos

    public Contribuinte(int idade, char sexo, int tempoContribuicao) {
        this.idade = idade;
        this.sexo = sexo;
        this.tempoContribuicao = tempoContribuicao;
    }

    // Método para determinar se pode se aposentar
    public boolean podeSeAposentar() {
        if (sexo == 'M') {
            return idade >= 65 && tempoContribuicao >= 35;
        } else if (sexo == 'F') {
            return idade >= 62 && tempoContribuicao >= 30;
        } else {
            System.out.println("Sexo inválido.");
            return false;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getTempoContribuicao() {
        return tempoContribuicao;
    }

    public void setTempoContribuicao(int tempoContribuicao) {
        this.tempoContribuicao = tempoContribuicao;
    }
}
