package Atividade4;

public class Quadrado implements Forma {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calculaArea() {
        return lado * lado;
    }

    public int getLado() {
        return lado;
    }
}
