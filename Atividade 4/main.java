package Atividade4;

public class main {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(6, 4);
        Forma quadrado = new Quadrado(4);
        Forma circulo = new Circulo(4.6);

        System.out.println("Área do retângulo: " + retangulo.calculaArea());
        System.out.println("Área do quadrado: " + quadrado.calculaArea());
        System.out.println("Área do círculo: " + circulo.calculaArea());
    }
}

