import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
