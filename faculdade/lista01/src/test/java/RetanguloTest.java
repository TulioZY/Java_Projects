import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import listas.Retangulo;

public class RetanguloTest {

    private Retangulo retangulo;

    @BeforeEach
    public void setUp() {
        retangulo = new Retangulo(5.0, 3.0);
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = 15.0; // Área calculada manualmente
        double areaCalculada = retangulo.calcularArea();

        assertEquals(areaEsperada, areaCalculada, 0.01); // Comparando com precisão de 2 casas decimais
    }

    @Test
    public void testCalcularPerimetro() {
        double perimetroEsperado = 16.0; // Perímetro calculado manualmente
        double perimetroCalculado = retangulo.calcularPerimetro();

        assertEquals(perimetroEsperado, perimetroCalculado, 0.01); // Comparando com precisão de 2 casas decimais
    }

    @Test
    public void testGetBase() {
        double baseEsperada = 5.0;
        double baseObtida = retangulo.getBase();

        assertEquals(baseEsperada, baseObtida, 0.0);
    }

    @Test
    public void testSetBase() {
        double novaBase = 10.0;
        retangulo.setBase(novaBase);

        assertEquals(novaBase, retangulo.getBase(), 0.0);
    }

    @Test
    public void testGetAltura() {
        double alturaEsperada = 3.0;
        double alturaObtida = retangulo.getAltura();

        assertEquals(alturaEsperada, alturaObtida, 0.0);
    }

    @Test
    public void testSetAltura() {
        double novaAltura = 4.0;
        retangulo.setAltura(novaAltura);

        assertEquals(novaAltura, retangulo.getAltura(), 0.0);
    }
}
