package listas;
public class Aluno {

    private String nome;
    private double av1;
    private double av2;
    private double av3;
    private double ai = 0; // Valor inicial da AI como 0

    public Aluno(String nome, double av1, double av2, double av3) {
        this.nome = nome;
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    public void setAi(double ai) {
        this.ai = ai;
    }

    public double getPontuacaoFinal() {
        double pontuacaoFinal = av1 + av2 + av3;

        if (ai > 0) {
            double menorNota = Math.min(av1, av2);
            if (ai > menorNota) {
                pontuacaoFinal = pontuacaoFinal - menorNota + ai;
            }
        }

        return pontuacaoFinal;
    }

    public int getAprovacao() {
        double pontuacaoFinal = getPontuacaoFinal();

        if (pontuacaoFinal >= 70) {
            if (ai == 0) {
                return 1; // Aprovado sem AI
            } else {
                return 2; // Aprovado com AI
            }
        } else {
            return 3; // Reprovado
        }
    }
}

