package listas;

public class Numeros {

    private int numero1;
    private int numero2;
    private int numero3;


    public Numeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    // Método para obter o menor número
    public int obterMenor() {
        int menor = Math.min(numero1, numero2);
        return Math.min(menor, numero3);
    }

    // Método para obter o maior número
    public int obterMaior() {
        int maior = Math.max(numero1, numero2);
        return Math.max(maior, numero3);
    }
}

