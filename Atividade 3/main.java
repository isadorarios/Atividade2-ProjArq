package Atividade2;

public class main {
    public static void main(String[] args) {
        Funcionario contrato = new Contrato(2000f, 500f);
        Funcionario estagio = new Estagio(1000f, 200f);
        Funcionario clt = new Clt(3000f, 800f, 600f);

        Folha folha1 = new Folha();
        folha1.calcular(contrato);
        System.out.println("Salário do contratado: " + folha1.getSaldo());

        Folha folha2 = new Folha();
        folha2.calcular(estagio);
        System.out.println("Bolsa do estagiário: " + folha2.getSaldo());

        Folha folha3 = new Folha();
        folha3.calcular(clt);
        System.out.println("Salário do CLT: " + folha3.getSaldo());
    }
}
