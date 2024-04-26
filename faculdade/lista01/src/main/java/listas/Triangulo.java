package listas;

public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;
    private double base;

    public Triangulo(double lado1, double lado2, double lado3, double altura, double base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        this.base = base;
    }

    // Método para calcular a área do triângulo
    public double calcularArea() {
        if (base == 0) {
            base = altura; // Se a base não foi fornecida, assume que é igual à altura
        }
        return (base * altura) / 2;
    }

    // Método para calcular o perímetro do triângulo
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Método para identificar o tipo de triângulo
    public String obterTipoTriangulo() {
        if (lado1 == lado2 && lado1 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
