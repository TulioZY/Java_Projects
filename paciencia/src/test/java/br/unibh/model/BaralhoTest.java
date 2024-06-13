package br.unibh.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaralhoTest {
    @Test
    void testBaralho() {
        Baralho baralho = new Baralho();
        assertEquals(52, baralho.size());
        Carta carta = baralho.puxarCarta();
        assertNotNull(carta);
        assertEquals(51, baralho.size());
    }
    
}
