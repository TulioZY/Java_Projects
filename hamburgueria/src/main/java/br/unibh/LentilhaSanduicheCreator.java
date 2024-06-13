package br.unibh;

public class LentilhaSanduicheCreator extends SanduicheCreator {
    @Override
    public Sanduiche criarSanduiche() {
        return new SanduicheVeganoDeLentilha();
    }
}

