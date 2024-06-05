package faculdade.lista02;

public class Lista02Exe03 {
    public static void main(String[] args) {
        metodoRecursivo(0); // Chamada inicial da função recursiva
        // Ao executar o código acima, a chamada inicial metodoRecursivo(0) inicia uma sequência de chamadas recursivas. Cada chamada imprime o valor do parâmetro i e realiza outra chamada com o valor incrementado.
    }

    //Estouro de Pilha: Esse processo de chamadas aninhadas leva a um estouro de pilha. A pilha de chamadas do programa é uma estrutura de dados que armazena as chamadas de funções em andamento. À medida que a recursão se aprofunda, a pilha armazena cada chamada sucessiva. Se a recursão não tiver um caso base para parar, a pilha continua crescendo sem limite, levando ao esgotamento da memória e ao estouro de pilha.
    public static void metodoRecursivo(int i) {
        System.out.println("Chamada recursiva: " + i); // Imprime o valor do parâmetro
        metodoRecursivo(i + 1); // Chamada recursiva com o valor incrementado
    }
}

    /*
    Código corrigido:

    public class Lista02Exe03 {
    public static void main(String[] args) {
        metodoRecursivo(0, 5);
    }

    public static void metodoRecursivo(int i, int limite) {
        if (i == limite) {
            System.out.println("Chamada final: " + i);
            return;
        }

        System.out.println("Chamada recursiva: " + i);
        metodoRecursivo(i + 1, limite);
    }

}
*/
