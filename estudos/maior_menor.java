import java.util.Scanner;
public class maior_menor {
    public static void main(String args[]) {
        System.out.println("Digite 5 números: ");
        Scanner s = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        num4 = s.nextInt();
        num5 = s.nextInt();
        if ( num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println("O maior número é: " + num1);
        }
        else if ( num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println("O maior número é: " + num2);
        }
        else if ( num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("O maior número é: " + num3);
        }
        else if ( num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println("O maior número é: " + num4);
        }
        else {
            System.out.println("O maior número é: " + num5);
        }
        if ( num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.println("O menor número é: " + num1);
        }
        else if ( num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
            System.out.println("O menor número é: " + num2);
        }
        else if ( num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            System.out.println("O menor número é: " + num3);
        }
        else if ( num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            System.out.println("O menor número é: " + num4);
        }
        else {
            System.out.println("O menor número é: " + num5);
        }
    }
}
