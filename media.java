import java.util.Scanner;
public class media {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float num1 = entrada.nextFloat();
        float num2 = entrada.nextFloat();
        float num3 = (num1 + num2) / 2;
            System.out.println("A média é " + num3);
    }
}