package br.unibh;

public class MovimentoPeao implements Movimento {
    @Override
    public int[] mover(int x, int y) {
        return new int[] { x + 1, y };
    }
}

