public class Main {
    public static void main(String[] args) {

        TurmaDao dao = new TurmaDao();
        Turma turma = dao.load();

        TurmaView view = new TurmaView();
        view.imprimeDados(turma);
        view.mostraDados(turma);

        dao.save(turma);
    }
}