import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos = new ArrayList<>();

    public float calcMedia() {
        if (alunos.isEmpty()) return 0;

        float soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getMedia();
        }
        return soma / alunos.size();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void add(Aluno aluno) {
        alunos.add(aluno);
    }

    public void delete(Aluno aluno) {
        alunos.remove(aluno);
    }
}
