package Atividade4;

public class main {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(10, 5);
        Forma quadrado = new Quadrado(7);
        Forma circulo = new Circulo(4.5);

        System.out.println("Área do retângulo: " + retangulo.calculaArea());
        System.out.println("Área do quadrado: " + quadrado.calculaArea());
        System.out.println("Área do círculo: " + circulo.calculaArea());
    }
}
