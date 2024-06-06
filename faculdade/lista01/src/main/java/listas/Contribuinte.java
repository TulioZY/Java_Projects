package listas;

public class Contribuinte {

    private int idade;
    private Sexo sexo;
    private int tempoContribuicao;

    public Contribuinte(int idade, Sexo sexo, int tempoContribuicao) {
        validarIdade(idade);
        validarSexo(sexo);
        validarTempoContribuicao(tempoContribuicao, idade);

        this.idade = idade;
        this.sexo = sexo;
        this.tempoContribuicao = tempoContribuicao;
    }

    private void validarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }

    private void validarSexo(Sexo sexo) {
        if (sexo == null) {
            throw new IllegalArgumentException("Sexo inválido. Deve ser MASCULINO ou FEMININO.");
        }
    }

    private void validarTempoContribuicao(int tempoContribuicao, int idade) {
        if (tempoContribuicao < 0) {
            throw new IllegalArgumentException("Tempo de contribuição não pode ser negativo.");
        }
        if (tempoContribuicao >= idade) {
            throw new IllegalArgumentException("Tempo de contribuição não pode ser maior ou igual à idade.");
        }
    }

    public boolean podeSeAposentar() {
        if (sexo == Sexo.MASCULINO) {
            return idade >= 65 && tempoContribuicao >= 35;
        } else {
            return idade >= 62 && tempoContribuicao >= 30;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        validarIdade(idade);
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        validarSexo(sexo);
        this.sexo = sexo;
    }

    public int getTempoContribuicao() {
        return tempoContribuicao;
    }

    public void setTempoContribuicao(int tempoContribuicao) {
        validarTempoContribuicao(tempoContribuicao, this.idade);
        this.tempoContribuicao = tempoContribuicao;
    }

    public enum Sexo {
        MASCULINO, FEMININO
    }
}
