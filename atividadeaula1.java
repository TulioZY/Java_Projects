import java.util.Scanner;
public class atividadeaula1 {
    public static void main(String args[]){
        int i = 0; 
        while (i <= 10000){
            System.out.print("Informe um número: ");
            Scanner s = new Scanner(System.in);
            int op = s.nextInt();
            System.out.println("O numero informado foi:" + op);
            i++;
            }
        }
    }

