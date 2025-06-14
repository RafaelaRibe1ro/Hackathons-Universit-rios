public class Projeto {
    private String titulo;
    private String descricao;
    private Equipe equipe;
    private Profissional orientador;
    private int notaFinal;

    public Projeto(String titulo, String descricao, Equipe equipe, Profissional orientador) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.equipe = equipe;
        this.orientador = orientador;
        this.notaFinal = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Projeto: " + titulo +
               " | Equipe: " + equipe.getNomeEquipe() +
               " | Nota Final: " + notaFinal;
    }
}
