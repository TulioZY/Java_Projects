package br.unibh;

public class GraoDeBicoSanduicheCreator extends SanduicheCreator {
    @Override
    public Sanduiche criarSanduiche() {
        return new SanduicheVeganoDeGraoDeBico();
    }
}

