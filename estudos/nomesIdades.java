import java.util.Scanner;

public class nomesIdades
{
    public static void main(String args[]) {
        final int qnt = 5;                     //QUANTIDADE DE NOMES 
        Scanner in = new Scanner(System.in);
        String nomes[] = new String[qnt];
        long idades[] = new long[qnt];
        System.out.println("Digite " + qnt + " nomes e 5 idades");         //PRIMEIRA SOLICITAÇAO
        for (int i = 0;  i < qnt; i++) {
            System.out.print("Digite o " +(i+1)+ "º Nome: ");              //SOLICITAR NOME
            nomes[i] = in.nextLine();
            System.out.print("Qual a idade de " +nomes[i] +" ? ");         //SOLICITAR IDADE DO NOME INFORMADO ANTERIORMENTE
            idades[i] = in.nextLong();
            in.nextLine();
    }
    System.out.println("Nomes\tIdade");                                    //APRESENTAR NOMES PARALELOS AS IDADES QUE FORAM PREENCHIDAS
    for (int i = 0; i < qnt; i++) {
        System.out.println(nomes[i] + "\t" + idades[i]);
    }
}

}