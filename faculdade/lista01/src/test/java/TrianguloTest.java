import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import listas.Triangulo;

public class TrianguloTest {

    @Test
    public void testCalcularAreaTrianguloEquilatero() {
        Triangulo triangulo = new Triangulo(6.0, 6.0, 6.0, 9, 0.0); // Base e altura iguais não são necessárias para triângulos equiláteros
        double areaEsperada = 40.5;
        double areaObtida = triangulo.calcularArea();

        assertEquals(areaEsperada, areaObtida, 0.001); // Precisão de 3 casas decimais
    }

    @Test
    public void testCalcularAreaTrianguloIsosceles() {
        Triangulo triangulo = new Triangulo(5.0, 8.0, 5.0, 7.0, 0.0); // Base e altura iguais não são necessárias para triângulos isósceles
        double areaEsperada = 24.5;
        double areaObtida = triangulo.calcularArea();

        assertEquals(areaEsperada, areaObtida, 0.001);
    }

    @Test
    public void testCalcularAreaTrianguloEscaleno() {
        Triangulo triangulo = new Triangulo(7.0, 9.0, 5.0, 6.0, 0.0);
        double areaEsperada = 18.0;
        double areaObtida = triangulo.calcularArea();

        assertEquals(areaEsperada, areaObtida, 0.001);
    }

    @Test
    public void testCalcularPerimetroTrianguloEquilatero() {
        Triangulo triangulo = new Triangulo(6.0, 6.0, 6.0, 0.0, 0.0);
        double perimetroEsperado = 18.0;
        double perimetroObtido = triangulo.calcularPerimetro();

        assertEquals(perimetroEsperado, perimetroObtido, 0.001);
    }

    @Test
    public void testCalcularPerimetroTrianguloIsosceles() {
        Triangulo triangulo = new Triangulo(5.0, 8.0, 5.0, 0.0, 0.0);
        double perimetroEsperado = 18.0;
        double perimetroObtido = triangulo.calcularPerimetro();

        assertEquals(perimetroEsperado, perimetroObtido, 0.001);
    }

    @Test
    public void testCalcularPerimetroTrianguloEscaleno() {
        Triangulo triangulo = new Triangulo(7.0, 9.0, 5.0, 0.0, 0.0);
        double perimetroEsperado = 21.0;
        double perimetroObtido = triangulo.calcularPerimetro();

        assertEquals(perimetroEsperado, perimetroObtido, 0.001);
    }

    @Test
    public void testObterTipoTrianguloEquilatero() {
        Triangulo triangulo = new Triangulo(6.0, 6.0, 6.0, 0.0, 0.0);
        String tipoEsperado = "Equilátero";
        String tipoObtido = triangulo.obterTipoTriangulo();

        assertEquals(tipoEsperado, tipoObtido);
    }

    @Test
    public void testObterTipoTrianguloIsosceles() {
        Triangulo triangulo = new Triangulo(5.0, 8.0, 5.0, 0.0, 0.0);
        String tipoEsperado = "Isósceles";
        String tipoObtido = triangulo.obterTipoTriangulo();

        assertEquals(tipoEsperado, tipoObtido);
    }

    @Test
    public void testObterTipoTrianguloEscaleno() {
        Triangulo triangulo = new Triangulo(7.0, 9.0, 5.0, 0.0, 0.0);
        String tipoEsperado = "Escaleno";
        String tipoObtido = triangulo.obterTipoTriangulo();

        assertEquals(tipoEsperado, tipoObtido);
    }
}
