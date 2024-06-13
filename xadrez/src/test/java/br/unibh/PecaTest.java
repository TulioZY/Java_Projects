package br.unibh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PecaTest {
    @Test
    public void testExecutarMovimentoCavalo() {
        Peca peca = new Peca(new MovimentoCavalo());
        int[] novaPosicao = peca.executarMovimento(0, 0);
        assertArrayEquals(new int[]{2, 1}, novaPosicao);
    }

    @Test
    public void testExecutarMovimentoPeao() {
        Peca peca = new Peca(new MovimentoPeao());
        int[] novaPosicao = peca.executarMovimento(0, 0);
        assertArrayEquals(new int[]{1, 0}, novaPosicao);
    }

    @Test
    public void testExecutarMovimentoBispo() {
        Peca peca = new Peca(new MovimentoBispo());
        int[] novaPosicao = peca.executarMovimento(0, 0);
        assertArrayEquals(new int[]{1, 1}, novaPosicao);
    }

    @Test
    public void testAlterarMovimento() {
        Peca peca = new Peca(new MovimentoPeao());
        peca.setMovimento(new MovimentoBispo());
        int[] novaPosicao = peca.executarMovimento(0, 0);
        assertArrayEquals(new int[]{1, 1}, novaPosicao);
    }
}

