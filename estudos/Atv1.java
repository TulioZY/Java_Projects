package estudos;

import java.util.Scanner;
public class Atv1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a base do retângulo (cm): ");
        float base = entrada.nextFloat();

        System.out.println("Informe a altura do retângulo (cm): ");
        float altura = entrada.nextFloat();

        float perimetro;
        float area;

        perimetro = (base * 2) + (altura * 2);
        area = base * altura;

        System.out.println("O perímetro do retângulo é: " + perimetro + " centímetros e sua respectiva área é: " + area + " cm²");
    }
}
