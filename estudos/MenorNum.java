import java.util.Scanner;
public class MenorNum {
    public static void main(String args[]) {
        System.out.println("Digite 5 valores: ");
        Scanner s = new Scanner(System.in);
        int i = 0;
        boolean primeiro = true;
        float menor = 0;
        while (i < 5){
            var x = s.nextFloat();
            if(primeiro){
                menor = x;
                primeiro = false;
            }
            if (menor > x){
                menor = x;
            }
            i++;
        }
        System.out.println("Menor número é: " + menor);
    }   
}