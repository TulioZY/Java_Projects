package br.unibh.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {

    @Test
    void testCriacaoCarta() {
        Carta carta = new Carta(Carta.Naipe.COPAS, Carta.Valor.AS);
        assertEquals(Carta.Naipe.COPAS, carta.getNaipe());
        assertEquals(Carta.Valor.AS, carta.getValor());
    }
    
}
