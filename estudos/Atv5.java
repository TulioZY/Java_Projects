import java.util.Scanner;
public class Atv5 {
    public static void main (String args[]){
        System.out.println("Digite um número: ");
        Scanner entrada = new Scanner(System.in);
        double num1 = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        Scanner entrada2 = new Scanner(System.in);
        double num2 = entrada2.nextDouble();

        System.out.println("Digite o número da operação que deseja fazer: ");
        System.out.println("1 - Média ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");
        Scanner entrada3 = new Scanner(System.in);
        String operador = entrada3.nextLine();
        
        if (operador.equals("1")){
            double media = (num1 + num2) / 2;
            System.out.println("A média dos números é: "+ media);
        }
        else if (operador.equals("2")){
            double subtracao = num1 - num2;
            System.out.println("A subtração dos números é: "+ subtracao);
        }
        else if (operador.equals("3")){
            double multiplicacao = num1 * num2;
            System.out.println("A multiplicação dos números é: "+ multiplicacao);
        }
        else if (operador.equals("4")){
            if (num2 != 0){
                double divisao = num1 / num2;
                System.out.println("A divisão dos números é: "+ divisao);
            }
            else {
                System.out.println("Impossível fazer divisão por 0 (zero)");
            }
        
        }
        else {
            System.out.println("Opção inválida.");
        }
    }
}
