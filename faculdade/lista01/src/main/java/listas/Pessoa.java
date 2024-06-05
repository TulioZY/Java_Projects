package listas;

public class Pessoa {

    private double peso; // Peso em kg
    private double altura; // Altura em metros


    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido: deve ser positivo.");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida: deve ser positiva.");
        }
        this.altura = altura;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(70.0, 1.70);
        double imc = pessoa1.calcularIMC(); // Calculando o IMC

        System.out.println("IMC da pessoa: " + imc);
    }
}

