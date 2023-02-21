import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {
        int num1 = 2, num2 = 8, result = 0;
        System.out.println("Informe uma opção: ");
        Scanner s = new Scanner(System.in);
        int op = s.nextInt();
        switch (op) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 * num2;
             break;
            case 3:
                result = num1 - num2;
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
            }
        System.out.println("O resultado é: "+result);
		    s.close();
    }
}