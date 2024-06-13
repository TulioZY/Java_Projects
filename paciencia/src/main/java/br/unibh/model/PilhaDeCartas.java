package br.unibh.model;

import java.util.Stack;

public class PilhaDeCartas {
    private Stack<Carta> pilha;

    public PilhaDeCartas() {
        pilha = new Stack<>();
    }

    public void adicionarCarta(Carta carta) {
        pilha.push(carta);
    }

    public Carta removerCarta() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        }
        return null;
    }

    public Carta verTopo() {
        if (!pilha.isEmpty()) {
            return pilha.peek();
        }
        return null;
    }

    public boolean estaVazia() {
        return pilha.isEmpty();
    }

    public int size() {
        return pilha.size();
    }

    @Override
    public String toString() {
        return pilha.toString();
    }

    public void adicionarCartasInvertido(Stack<Carta> cartas) {
        while (!cartas.isEmpty()) {
            adicionarCarta(cartas.pop());
        }
    }
}
