import java.util.Scanner;
public class notas {
    public static void main(String args[]){
        int qtd = 0;
        while (qtd <=50){
            System.out.print("Informe a nota: ");
            Scanner s = new Scanner(System.in);
            Float nota = s.nextFloat();
            if (nota >= 70){
                System.out.println("Aluno aprovado!");
            }
            else{
                System.out.println("Aluno reprovado :c");
            }
        }
    }
}
