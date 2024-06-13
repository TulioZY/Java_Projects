package br.unibh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovimentoCavaloTest {
    @Test
    public void testMover() {
        MovimentoCavalo cavalo = new MovimentoCavalo();
        int[] novaPosicao = cavalo.mover(0, 0);
        assertArrayEquals(new int[]{2, 1}, novaPosicao);
    }
}

