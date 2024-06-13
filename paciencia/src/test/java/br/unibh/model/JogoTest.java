package br.unibh.model;

import br.unibh.controller.Jogo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogoTest {
    private Jogo jogo;

    @BeforeEach
    void setUp() {
        // Resetar o singleton para garantir um estado limpo para cada teste
        jogo = Jogo.getInstance();
        // Limpar o estado do jogo (remoção de todas as cartas)
        for (PilhaDeCartas coluna : jogo.getColunas()) {
            while (!coluna.estaVazia()) {
                coluna.removerCarta();
            }
        }
        for (PilhaDeCartas fundacao : jogo.getFundacoes()) {
            while (!fundacao.estaVazia()) {
                fundacao.removerCarta();
            }
        }
    }

    @Test
    void testPuxarCartaDoBaralho() {
        int cartasNasColunasAntes = 0;
        for (PilhaDeCartas coluna : jogo.getColunas()) {
            cartasNasColunasAntes += coluna.size();
        }

        jogo.puxarCartaDoBaralho();

        int cartasNasColunasDepois = 0;
        for (PilhaDeCartas coluna : jogo.getColunas()) {
            cartasNasColunasDepois += coluna.size();
        }

        assertEquals(cartasNasColunasAntes + 7, cartasNasColunasDepois, "Cada coluna deve ter uma carta a mais.");
    }

    @Test
    void testMoverCartasEntreColunas() {
        PilhaDeCartas[] colunas = jogo.getColunas();

        Carta reiDeCopas = new Carta(Carta.Naipe.COPAS, Carta.Valor.REI);
        Carta damaDeCopas = new Carta(Carta.Naipe.COPAS, Carta.Valor.DAMA);
        Carta valeteDeCopas = new Carta(Carta.Naipe.COPAS, Carta.Valor.VALETE);

        colunas[0].adicionarCarta(valeteDeCopas);
        colunas[0].adicionarCarta(damaDeCopas);
        colunas[0].adicionarCarta(reiDeCopas);

        jogo.moverCartas(0, 3, 1);

        assertTrue(colunas[0].estaVazia(), "A coluna de origem deve estar vazia após mover as cartas.");
        assertEquals(reiDeCopas, colunas[1].verTopo(), "A carta no topo da coluna de destino deve ser o Rei de Copas.");
        assertEquals(3, colunas[1].size(), "A coluna de destino deve ter três cartas.");
    }

    @Test
    void testVenceu() {
        for (PilhaDeCartas fundacao : jogo.getFundacoes()) {
            for (Carta.Valor valor : Carta.Valor.values()) {
                fundacao.adicionarCarta(new Carta(Carta.Naipe.PAUS, valor));
            }
        }

        assertTrue(jogo.venceu(), "O jogo deve ser considerado vencido.");
    }
}
