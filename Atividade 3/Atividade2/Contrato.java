package Atividade2;

public class Contrato implements Funcionario {
    private float salarioBase;
    private float beneficios;

    public Contrato(float salarioBase, float beneficios) {
        this.salarioBase = salarioBase;
        this.beneficios = beneficios;
    }

    public float salario() {
        return salarioBase + beneficios;
    }

    @Override
    public float remuneracao() {
        return salario();
    }
}
