package Atividade2;

public class Clt implements Funcionario {
    private float salarioBase;
    private float beneficios;
    private float descontos;

    public Clt(float salarioBase, float beneficios, float descontos) {
        this.salarioBase = salarioBase;
        this.beneficios = beneficios;
        this.descontos = descontos;
    }

    public float salarioLiquido() {
        return salarioBase + beneficios - descontos;
    }

    @Override
    public float remuneracao() {
        return salarioLiquido();
    }
}
