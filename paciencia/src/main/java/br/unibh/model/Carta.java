package br.unibh.model;

public class Carta {
    public enum Naipe {COPAS, OUROS, ESPADAS, PAUS}
    public enum Valor {AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI}

    private final Naipe naipe;
    private final Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
    
}
