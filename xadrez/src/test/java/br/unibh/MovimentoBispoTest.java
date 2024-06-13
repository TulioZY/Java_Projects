package br.unibh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovimentoBispoTest {
    @Test
    public void testMover() {
        MovimentoBispo bispo = new MovimentoBispo();
        int[] novaPosicao = bispo.mover(0, 0);
        assertArrayEquals(new int[]{1, 1}, novaPosicao);
    }
}

