package listas;

public class Retangulo {

    private double base; // Base do retângulo
    private double altura; // Altura do retângulo

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5.0, 3.0); // Criando um objeto Retângulo
        double area = retangulo1.calcularArea(); // Calculando a área
        double perimetro = retangulo1.calcularPerimetro(); // Calculando o perímetro

        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
