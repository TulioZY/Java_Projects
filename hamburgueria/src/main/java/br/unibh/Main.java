package br.unibh;

public class Main {
    public static void main(String[] args) {
        SanduicheCreator creator1 = new GraoDeBicoSanduicheCreator();
        Sanduiche sanduiche1 = creator1.pedirSanduiche();
        System.out.println("Sanduíche vegano de grão-de-bico está pronto.\n");

        SanduicheCreator creator2 = new LentilhaSanduicheCreator();
        Sanduiche sanduiche2 = creator2.pedirSanduiche();
        System.out.println("Sanduíche vegano de lentilha está pronto.");
    }
}

