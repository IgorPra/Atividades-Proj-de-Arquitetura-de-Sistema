import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private float media;

    public Aluno(String nome, float media) {
        this.nome = nome;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
