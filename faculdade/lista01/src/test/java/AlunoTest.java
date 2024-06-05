import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import listas.Aluno;

public class AlunoTest {

    @Test
    public void testAlunoReprovadoSemAI() {
        Aluno aluno = new Aluno("João", 10, 10, 10, 0);
        assertEquals(30, aluno.getPontuacaoFinal());
        assertEquals(3, aluno.getAprovacao()); // Reprovado
    }

    @Test
    public void testAlunoAprovadoSemAI() {
        Aluno aluno = new Aluno("Maria", 20, 20, 35, 0);
        assertEquals(75, aluno.getPontuacaoFinal());
        assertEquals(1, aluno.getAprovacao()); // Aprovado sem AI
    }

    @Test
    public void testAlunoReprovadoComAI() {
        Aluno aluno = new Aluno("Pedro", 21, 19, 20, 0);
        aluno.setAi(25);
        assertEquals(66, aluno.getPontuacaoFinal());
        assertEquals(3, aluno.getAprovacao()); // Reprovado com AI
    }

    @Test
    public void testAlunoReprovadoComAIBaixa() {
        Aluno aluno = new Aluno("Ana", 21, 19, 20, 0);
        aluno.setAi(13);
        assertEquals(60, aluno.getPontuacaoFinal());
        assertEquals(3, aluno.getAprovacao()); // Reprovado
    }

    @Test
    public void testAlunoAprovadoComAIGrande() {
        Aluno aluno = new Aluno("Carlos", 21, 19, 20, 0);
        aluno.setAi(30);
        assertEquals(71, aluno.getPontuacaoFinal());
        assertEquals(2, aluno.getAprovacao()); // Aprovado com AI
    }

    @Test
    public void testNotaA1Invalida() {
        assertThrows(IllegalArgumentException.class, () -> new Aluno("João", -10, 20, 30, 0));
    }

    @Test
    public void testNotaA2Invalida() {
        assertThrows(IllegalArgumentException.class, () -> new Aluno("Maria", 20, -40, 30, 0));
    }

    @Test
    public void testNotaAIInvalida() {
        assertThrows(IllegalArgumentException.class, () -> new Aluno("Pedro", 21, 19, 20, -5));
    }

    @Test
    public void testNotaA3Invalida() {
        assertThrows(IllegalArgumentException.class, () -> new Aluno("Ana", 21, 19, 50, 0));
    }
}
