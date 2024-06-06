import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import listas.Contribuinte;
import listas.Contribuinte.Sexo;

public class ContribuinteTest {

    @Test
    public void testPodeSeAposentarHomem() {
        Contribuinte contribuinte = new Contribuinte(70, Sexo.MASCULINO, 40);
        boolean resultadoEsperado = true;
        boolean resultadoObtido = contribuinte.podeSeAposentar();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void testPodeSeAposentarMulher() {
        Contribuinte contribuinte = new Contribuinte(60, Sexo.FEMININO, 25);
        boolean resultadoEsperado = false;
        boolean resultadoObtido = contribuinte.podeSeAposentar();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void testSexoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte(30, null, 10);
        });
    }

    @Test
    public void testIdadeNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte(-5, Sexo.MASCULINO, 10);
        });
    }

    @Test
    public void testTempoContribuicaoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte(30, Sexo.FEMININO, -10);
        });
    }

    @Test
    public void testTempoContribuicaoMaiorQueIdade() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte(30, Sexo.MASCULINO, 40);
        });
    }
}
