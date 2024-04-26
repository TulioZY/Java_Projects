import java.util.Scanner;
    public class Desviopadrao {

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
        int i = 0;
        System.out.println("Média = " + media);
        soma = soma + Math.pow((a[i] - media), 2);
        int desvio_padrao = Math.sqrt(soma/a[i]);
        System.out.println("Desvio padrão = " + desvio_padrao);
        sc.close();

}
}