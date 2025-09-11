package Atividade2;

public class Folha {
    private float saldo;

    public void calcular(Funcionario f) {
        this.saldo = f.remuneracao();
    }

    public float getSaldo() {
        return saldo;
    }
}
