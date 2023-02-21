import java.util.Scanner;
public class Atv3 {
    public static void main(String args[]){
        System.out.println("Informe seu peso: ");
        Scanner entrada = new Scanner(System.in);
        float peso = entrada.nextFloat();

        System.out.println("Informe sua altura: ");
        Scanner entrada2 = new Scanner(System.in);
        float altura = entrada2.nextFloat();
        altura = altura / 100;

        float imc = (peso/(altura * altura));

        if (imc < 18.5){
            System.out.println("Você está abaixo do peso.");
        }
        if (imc >= 18.5 && imc <= 25){
            System.out.println("Você está no peso normal.");
        }
        if (imc > 25 && imc <= 30){
            System.out.println("Você está acima do peso.");
        }
        if (imc > 30){
            System.out.println("Você está obeso.");
        }

    }
}
