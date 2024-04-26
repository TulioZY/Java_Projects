import java.util.Scanner;
public class menor {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float num1 = entrada.nextFloat();
        float num2 = entrada.nextFloat();
        if (num1 < num2) {
            System.out.println(num1 + "é menor que " + num2);
        }
        else {
            System.out.println(num2 + " é menor que " + num1);
        }
    }
}