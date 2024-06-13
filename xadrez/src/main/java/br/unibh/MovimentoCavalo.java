package br.unibh;

public class MovimentoCavalo implements Movimento {
    @Override
    public int[] mover(int x, int y) {
        return new int[] { x + 2, y + 1 };
    }
}

