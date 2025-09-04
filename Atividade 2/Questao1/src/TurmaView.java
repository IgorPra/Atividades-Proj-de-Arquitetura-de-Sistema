public class TurmaView {
    public void imprimeDados(Turma turma) {
        System.out.println("=== Dados da Turma ===");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println("Aluno: " + aluno.getNome() + " | Média: " + aluno.getMedia());
        }
    }

    public void mostraDados(Turma turma) {
        System.out.println("Média da turma: " + turma.calcMedia());
    }
}
