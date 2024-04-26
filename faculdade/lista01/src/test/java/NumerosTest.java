import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import listas.Numeros;

public class NumerosTest {

    @Test
    public void testObterMenorComNumerosIguais() {
        Numeros numeros = new Numeros(10, 10, 10);
        int menorEsperado = 10;
        int menorObtido = numeros.obterMenor();

        assertEquals(menorEsperado, menorObtido);
    }

    @Test
    public void testObterMenorComNumerosDiferentes() {
        Numeros numeros = new Numeros(5, 2, 8);
        int menorEsperado = 2;
        int menorObtido = numeros.obterMenor();

        assertEquals(menorEsperado, menorObtido);
    }

    @Test
    public void testObterMaiorComNumerosIguais() {
        Numeros numeros = new Numeros(10, 10, 10);
        int maiorEsperado = 10;
        int maiorObtido = numeros.obterMaior();

        assertEquals(maiorEsperado, maiorObtido);
    }

    @Test
    public void testObterMaiorComNumerosDiferentes() {
        Numeros numeros = new Numeros(5, 2, 8);
        int maiorEsperado = 8;
        int maiorObtido = numeros.obterMaior();

        assertEquals(maiorEsperado, maiorObtido);
    }

}
