package br.unibh;

public class Peca {
    private Movimento movimento;

    public Peca(Movimento movimento) {
        this.movimento = movimento;
    }

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    public int[] executarMovimento(int x, int y) {
        return movimento.mover(x, y);
    }
}

