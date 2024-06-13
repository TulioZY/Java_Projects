package br.unibh;

public class SanduicheVeganoDeLentilha implements Sanduiche {
    @Override
    public void preparar() {
        System.out.println("Preparando sanduíche vegano de lentilha.");
    }

    @Override
    public void cozinhar() {
        System.out.println("Cozinhando sanduíche vegano de lentilha.");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando sanduíche vegano de lentilha.");
    }
}

