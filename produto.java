import java.util.Scanner;
public class produto {
    public static void main(String args[]) {
        System.out.println("Digite 3 números: ");
        Scanner s = new Scanner(System.in);
        int num1, num2, num3;
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        System.out.println("O produto dos 3 números é: " + (num1 * num2 * num3));

    }
    
}
