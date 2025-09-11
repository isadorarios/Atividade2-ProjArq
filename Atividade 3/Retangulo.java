package Atividade4;

public class Retangulo implements Forma {
    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calculaArea() {
        return base * altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
}
