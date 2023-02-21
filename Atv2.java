import java.util.Scanner;
public class Atv2 {
    public static void main(String args[]){
        System.out.println("Insira o preço do produto:");
        Scanner entrada= new Scanner(System.in);
        double preco, desconto, precoFinal, s, juros;
        preco = entrada.nextDouble();
        System.out.println("Selecione o método de pagamento: ");
        System.out.println("1 - À vista com 10% de desconto");
        System.out.println("2 - À vista no cartão com 5% de desconto");
        System.out.println("3 - 2x com preço normal sem juros");
        System.out.println("4 - 3x com preço normal mais 10% de juros");

        Scanner entrada2 = new Scanner(System.in);
        int opcao;
        opcao = entrada2.nextInt();
        switch (opcao){
            case 1:
            desconto = 10;
            s = 100 - desconto;
            precoFinal = (s*preco) / 100;
            System.out.println("O preço original é de: "+ preco);
            System.out.println("O preço final a ser pago é de: "+ precoFinal);
            break;

            case 2:
            desconto = 5;
            s = 100 - desconto;
            precoFinal = (s*preco) / 100;
            System.out.println("O preço original é de: "+ preco);
            System.out.println("O preço final a ser pago é de: "+ precoFinal);
            break;

            case 3:
            System.out.println("O preço final a ser pago é de: "+ preco);
            break;

            case 4:
            //calculando juros de 10% por 3 meses
            juros = 10*3;
            s = 100 + juros;
            precoFinal = (s*preco) / 100;
            System.out.println("O preço original é de: "+ preco);
            System.out.println("O preço final a ser pago é de: "+ precoFinal);
            break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
