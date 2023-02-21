import java.util.Scanner;
    public class Vetores {

        public static void main(String[] args) {
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.println("a[" +i+"]? ");
            a[i] = sc.nextInt();
        }

        int soma = 0;
        for(int i = 0; i < a.length; i++){
            System.out.println("a[" +i+"]= " + a[i]);
            soma = soma + a[i];
        }
        int media = soma / 2;
        System.out.println("Média = " + media);
        sc.close();

}
}