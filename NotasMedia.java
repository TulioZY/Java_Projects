import java.util.Scanner;
import java.util.Arrays;
public class NotasMedia {
    public static void main(String args[]){
        int i = 0;
        String nomes[] = new String[5];
        double notas[] = new double[5];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i<=4; i++){
            System.out.println("Digite o nome do aluno nº: "+ (i + 1));
            nomes[i] = sc.nextLine();
            System.out.println("Digite a nota do aluno nº: "+ (i + 1));
            notas[i] = Double.parseDouble(sc.nextLine());
        }
        
        double soma = 0;
        for (i = 0; i < 5; i++){
            soma += notas[i]; 
        }
        double media = (soma/5);
        System.out.println("A nota média da turma foi de: " + media);
        for (i = 0; i < 5; i++){
            if (notas[i] >= media){
                System.out.println("Aluno nº" + i + "passou com nota: "+ notas[i]);
            }
        }

    }
}
