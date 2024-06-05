package faculdade.lista02;

import java.util.Scanner;


public class Lista02Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número decimal: ");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número decimal: ");
            double num2 = scanner.nextDouble();

            validarNumeros(num1, num2);

            double resultado = num1 / num2;
            System.out.printf("O resultado da divisão é: %.2f", resultado);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void validarNumeros(double num1, double num2) {
        if (num1 <= 0 || num2 <= 0) {
            throw new IllegalArgumentException("Os números devem ser positivos!");
        }
    }
    
}
