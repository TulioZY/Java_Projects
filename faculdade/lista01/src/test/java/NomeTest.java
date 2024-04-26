/**
 * Atenção professor Lucas, 
 * Creio que mais testes são necessários para verificar diferentes cenários, 
 * como nomes com espaços em branco, caracteres especiais, valores nulos, etc.
 * Porém, a procrastinação atacou feio..
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import listas.Nome;

public class NomeTest {

    private Nome nome;

    @BeforeEach
    public void setUp() {
        nome = new Nome("Sr.", "Túlio", "Correia", "Rocha");
    }

    @Test
    public void testObterNomeCompletoComTodosCampos() {
        String nomeCompletoEsperado = "Sr. Túlio Correia Rocha";
        String nomeCompletoObtido = nome.obterNomeCompleto();

        assertEquals(nomeCompletoEsperado, nomeCompletoObtido);
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals("Sr.", nome.getTitulo());
        assertEquals("Túlio", nome.getNomePrincipal());
        assertEquals("Correia", nome.getNomeMeio());
        assertEquals("Rocha", nome.getSobrenome());

        nome.setTitulo("Dr.");
        nome.setNomePrincipal("Maria");
        nome.setNomeMeio(null); // Nome do meio opcional
        nome.setSobrenome("Oliveira");

        String nomeCompletoEsperadoAtualizado = "Dr. Maria Oliveira";
        String nomeCompletoObtidoAtualizado = nome.obterNomeCompleto();

        assertEquals(nomeCompletoEsperadoAtualizado, nomeCompletoObtidoAtualizado);
    }

}
