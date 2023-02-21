import java.util.Scanner;
public class obtendomaiorvalor {
    public static void main(String args[]) {
    Scanner entrada = new Scanner (System.in);
//  Declarando quantos números o usuário irá digitar.
    int valor[] = new int[5];

 // Obtendo os valores dos inputs.
    for(int i = 0; i < valor.length; i++){
        System.out.print("Digite o " +(i+1)+"º valor: ");
        valor[i] = entrada.nextInt();
    }

// Obtendo o maior valor
    int maior = valor[0];
    for (int i = 1 ; i < valor.length; i++){
            if ( valor[i] > maior) {
                  maior = valor[i];
           }
    }

 

//Mostra os resultados na tela.
    System.out.println("O maior valor dentre os números apresentados é = "+ maior);

    }
}