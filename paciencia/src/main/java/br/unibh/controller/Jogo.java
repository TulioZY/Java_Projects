package br.unibh.controller;

import java.util.Stack;

import br.unibh.model.Baralho;
import br.unibh.model.Carta;
import br.unibh.model.PilhaDeCartas;

public class Jogo {
    private static Jogo instance;
    private Baralho baralho;
    private PilhaDeCartas[] colunas;
    private PilhaDeCartas[] fundacoes;

    private Jogo() {
        baralho = new Baralho();
        colunas = new PilhaDeCartas[7];
        fundacoes = new PilhaDeCartas[4];

        //É necessário garantir que o jogo só tenha uma instância ativa, estando assim de acordo com o padrão de projetos 'Singleton'.
        for (int i = 0; i < colunas.length; i++) {
            colunas[i] = new PilhaDeCartas();
            for (int j = 0; j <= i; j++) {
                colunas[i].adicionarCarta(baralho.puxarCarta());
            }
        }

        for (int i = 0; i < fundacoes.length; i++) {
            fundacoes[i] = new PilhaDeCartas();
        }
    }

    public static Jogo getInstance() {
        if (instance == null) {
            instance = new Jogo();
        }
        return instance;
    }

    public PilhaDeCartas[] getColunas() {
        return colunas;
    }

    public PilhaDeCartas[] getFundacoes() {
        return fundacoes;
    }

    public void moverCartas(int origem, int numCartas, int destino) {
        PilhaDeCartas origemColuna = colunas[origem];
        PilhaDeCartas destinoColuna = colunas[destino];

        if (numCartas <= origemColuna.size()) {
            Stack<Carta> cartasParaMover = new Stack<>();

            for (int i = 0; i < numCartas; i++) {
                cartasParaMover.push(origemColuna.removerCarta());
            }

            destinoColuna.adicionarCartasInvertido(cartasParaMover);
        }
    }

    public void puxarCartaDoBaralho() {
        for (PilhaDeCartas coluna : colunas) {
            if (!baralho.estaVazio()) {
                coluna.adicionarCarta(baralho.puxarCarta());
            }
        }
    }

    public void moverParaFundacao(int coluna) {
        if (!colunas[coluna].estaVazia()) {
            Carta carta = colunas[coluna].verTopo();
            int indiceFundacao = carta.getNaipe().ordinal();
            PilhaDeCartas fundacao = fundacoes[indiceFundacao];
            
            if (podeMoverParaFundacao(carta, fundacao)) {
                fundacao.adicionarCarta(colunas[coluna].removerCarta());
            }
        }
    }

    private boolean podeMoverParaFundacao(Carta carta, PilhaDeCartas fundacao) {
        if (fundacao.estaVazia()) {
            return carta.getValor() == Carta.Valor.AS;
        } else {
            Carta topo = fundacao.verTopo();
            return topo.getNaipe() == carta.getNaipe() && topo.getValor().ordinal() + 1 == carta.getValor().ordinal();
        }
    }

    public boolean venceu() {
        for (PilhaDeCartas fundacao : fundacoes) {
            if (fundacao.size() != 13) {
                return false;
            }
        }
        return true;
    }
}
