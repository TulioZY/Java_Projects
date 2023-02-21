import java.util.Scanner;
public class atividade5 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float nota = entrada.nextFloat();
        if (nota >= 70) {
            System.out.println("Aprovado");
        }
        if (nota < 70){
            System.out.println("Reprovado");
        }
    }
}
