public class TurmaDao {

    public Turma load() {
        Turma turma = new Turma();
        turma.add(new Aluno("João", 8.0f));
        turma.add(new Aluno("Maria", 9.5f));
        return turma;
    }

    public void save(Turma turma) {
        System.out.println("Turma salva no banco.");
    }

    public void update(Turma turma) {
        System.out.println("Turma atualizada no banco.");
    }

    public void delete(Turma turma) {
        System.out.println("Turma deletada do banco.");
    }
}
