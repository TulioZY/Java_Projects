import java.util.Scanner;
public class Calculadora {
    public static void main (String args[]){
        System.out.println("Digite um número: ");
        Scanner entrada = new Scanner(System.in);
        double num1 = entrada.nextDouble();

        System.out.println("Digite um operador (+, -, /, *): ");
        Scanner entrada2 = new Scanner(System.in);
        String operador = entrada2.nextLine();
        
        System.out.println("Digite outro número: ");
        Scanner entrada3 = new Scanner(System.in);
        double num2 = entrada3.nextDouble();

        if (operador.equals("+")){
            double soma = num1 + num2;
            System.out.println("A soma dos números é: "+ soma);
        }
        else if (operador.equals("-")){
            double subtracao = num1 - num2;
            System.out.println("A subtração dos números é: "+ subtracao);
        }
        else if (operador.equals("*")){
            double multiplicacao = num1 * num2;
            System.out.println("A multiplicação dos números é: "+ multiplicacao);
        }
        else if (operador.equals("/")){
            if (num2 != 0){
                double divisao = num1 / num2;
                System.out.println("A divisão dos números é: "+ divisao);
            }
            else{
                System.out.println("Impossível fazer divisão por 0 (zero)");
            }
        }
    }
}
