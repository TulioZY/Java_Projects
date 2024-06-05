package listas;
public class Aluno {

    private String nome;
    private double av1;
    private double av2;
    private double av3;
    private double ai = 0; // Valor inicial da AI como 0

    public Aluno(String nome, double av1, double av2, double av3, double ai) {
        this.nome = nome;

        // Validação das notas A1, A2 e AI
        if (av1 < 0 || av1 > 30 || av2 < 0 || av2 > 30 || ai < 0 || ai > 30) {
            throw new IllegalArgumentException("As notas A1, A2 e AI devem ser valores não negativos menores ou iguais a 30.");
        }

        // Validação da nota A3
        if (av3 < 0 || av3 > 40) {
            throw new IllegalArgumentException("A nota A3 deve ser um valor não negativo menor ou igual a 40.");
        }

        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    public void setAi(double ai) {
        if (ai < 0 || ai > 30) {
            throw new IllegalArgumentException("A nota AI deve ser um valor não negativo menor ou igual a 30.");
        }
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

