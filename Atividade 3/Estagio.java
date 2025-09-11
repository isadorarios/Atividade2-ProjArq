package Atividade2;

public class Estagio implements Funcionario {
    private float bolsaEstagio;
    private float auxilioTransporte;

    public Estagio(float bolsaEstagio, float auxilioTransporte) {
        this.bolsaEstagio = bolsaEstagio;
        this.auxilioTransporte = auxilioTransporte;
    }

    public float bolsa() {
        return bolsaEstagio + auxilioTransporte;
    }

    @Override
    public float remuneracao() {
        return bolsa();
    }
}
