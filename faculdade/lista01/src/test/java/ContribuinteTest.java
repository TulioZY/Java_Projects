import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import listas.Contribuinte;

public class ContribuinteTest {

    @Test
    public void testPodeSeAposentarHomem() {
        Contribuinte contribuinte = new Contribuinte(70, 'M', 40);
        boolean resultadoEsperado = true;
        boolean resultadoObtido = contribuinte.podeSeAposentar();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void testPodeSeAposentarMulher() {
        Contribuinte contribuinte = new Contribuinte(60, 'F', 25);
        boolean resultadoEsperado = false;
        boolean resultadoObtido = contribuinte.podeSeAposentar();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void testPodeSeAposentarOutroSexo() {
        // Testando um sexo inválido
        Contribuinte contribuinte = new Contribuinte(55, 'X', 35);
        boolean resultadoEsperado = false;
        boolean resultadoObtido = contribuinte.podeSeAposentar();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void testSexoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte(30, 'X', 10);
        });
    }

    @Test
    public void testIdadeNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte(-5, 'M', 10);
        });
    }

    @Test
    public void testTempoContribuicaoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte(30, 'F', -10);
        });
    }

    @Test
    public void testTempoContribuicaoMaiorQueIdade() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte(30, 'M', 40);
        });
    }
}
