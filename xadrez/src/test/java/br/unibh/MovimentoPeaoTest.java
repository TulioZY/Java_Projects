package br.unibh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovimentoPeaoTest {
    @Test
    public void testMover() {
        MovimentoPeao peao = new MovimentoPeao();
        int[] novaPosicao = peao.mover(0, 0);
        assertArrayEquals(new int[]{1, 0}, novaPosicao);
    }
}

