import java.util.Scanner;
public class Atv6 {
    public static void main(String args[]){
        System.out.println("Informe os valores do índice pluviométrico mensal(31): ");
        int i = 0;
        int dia = 0;
        double soma, media, max;
        max = 0;
        double ind_Pluv[] = new double[31];
        soma = 0;
        while (i < 31){
            System.out.println("Dia "+(i+1)+":");
            Scanner entrada = new Scanner(System.in);
            ind_Pluv[i] = entrada.nextDouble();
            if (ind_Pluv[i] > max){
                max = ind_Pluv[i];
                dia = i+1;
            }
            i++;
        }
        for(int s = 0; s < ind_Pluv.length; s++){
            soma = soma + ind_Pluv[s];
        }
        media = soma/ind_Pluv.length;
       
        System.out.println("A média do índice pluviométrico é "+ media);
        System.out.println("O valor do índice pluviométrico de maior valor foi de "+ max); 
        System.out.println("Esse valor é referente ao dia "+ dia); 
    }
}
