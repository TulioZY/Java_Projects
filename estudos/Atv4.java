import java.util.Scanner;
public class Atv4 {
    public static void main(String args[]){
        System.out.println("Informe um número: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        System.out.println("O número " + num1 + " é referente ao mês de: ");

        if (num1 == 1){
            System.out.println("Janeiro");
        }
        if (num1 == 2){
            System.out.println("Fevereiro");
        }
        if (num1 == 3){
            System.out.println("Março");
        }
        if (num1 == 4){
            System.out.println("Abril");
        }
        if (num1 == 5){
            System.out.println("Maio");
        }
        if (num1 == 6){
            System.out.println("Junho");
        }
        if (num1 == 7){
            System.out.println("Julho");
        }
        if (num1 == 8){
            System.out.println("Agosto");
        }
        if (num1 == 9){
            System.out.println("Setembro");
        }
        if (num1 == 10){
            System.out.println("Outubro");
        }
        if (num1 == 11){
            System.out.println("Novembro");
        }
        if (num1 == 12){
            System.out.println("Dezembro");
        }

    }
}
