import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import listas.Pessoa;

public class PessoaTest {

    private Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa(70.0, 1.70);
    }

    @Test
    public void testCalcularIMC() {
        double imcEsperado = 24.29; // IMC calculado manualmente
        double imcCalculado = pessoa.calcularIMC();

        assertEquals(imcEsperado, imcCalculado, 0.1); // Comparando com precisão de 1 casa decimal
    }

    @Test
    public void testGetPeso() {
        double pesoEsperado = 70.0;
        double pesoObtido = pessoa.getPeso();

        assertEquals(pesoEsperado, pesoObtido, 0.0);
    }

    @Test
    public void testSetPeso() {
        double novoPeso = 80.0;
        pessoa.setPeso(novoPeso);

        assertEquals(novoPeso, pessoa.getPeso(), 0.0);
    }

    @Test
    public void testGetAltura() {
        double alturaEsperada = 1.70;
        double alturaObtida = pessoa.getAltura();

        assertEquals(alturaEsperada, alturaObtida, 0.0);
    }

    @Test
    public void testSetAltura() {
        double novaAltura = 1.80;
        pessoa.setAltura(novaAltura);

        assertEquals(novaAltura, pessoa.getAltura(), 0.0);
    }
}

