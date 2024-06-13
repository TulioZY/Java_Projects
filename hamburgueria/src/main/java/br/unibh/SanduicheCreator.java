package br.unibh;

public abstract class SanduicheCreator {
    public abstract Sanduiche criarSanduiche();

    public Sanduiche pedirSanduiche() {
        Sanduiche sanduiche = criarSanduiche();
        sanduiche.preparar();
        sanduiche.cozinhar();
        sanduiche.embalar();
        return sanduiche;
    }
}

