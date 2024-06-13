package br.unibh;

public class SanduicheVeganoDeGraoDeBico implements Sanduiche {
    @Override
    public void preparar() {
        System.out.println("Preparando sanduíche vegano de grão-de-bico.");
    }

    @Override
    public void cozinhar() {
        System.out.println("Cozinhando sanduíche vegano de grão-de-bico.");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando sanduíche vegano de grão-de-bico.");
    }
}

