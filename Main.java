public class Main {
    public static void main(String[] args) {
        Turma t = new Turma();
        Aluno isadora =  new Aluno("isadora", "2417195", 10.0);
        Aluno lara =  new Aluno("lara", "2410530", 8.0);
        Aluno cauan =  new Aluno("cauan", "2420519", 8.5);
        TurmaView view =  new TurmaView();
        t.add(isadora);
        t.add(lara);
        t.add(cauan);
        view.imprimeDados(t);
        view.mostraDados(t);
    }
}
