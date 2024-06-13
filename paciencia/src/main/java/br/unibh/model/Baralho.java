package br.unibh.model;

import java.util.Collections;
import java.util.Stack;

public class Baralho {
    private Stack<Carta> cartas;

    public Baralho() {
        cartas = new Stack<>();
        for (Carta.Naipe naipe : Carta.Naipe.values()) {
            for (Carta.Valor valor : Carta.Valor.values()) {
                cartas.push(new Carta(naipe, valor));
            }
        }
        Collections.shuffle(cartas);
    }

    public Carta puxarCarta() {
        return cartas.pop();
    }

    public boolean estaVazio() {
        return cartas.isEmpty();
    }
    
    public int size() {
        return cartas.size();
    }
}
