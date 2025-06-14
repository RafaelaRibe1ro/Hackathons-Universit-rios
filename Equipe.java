import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nomeEquipe;
    private List<Estudante> membros;
    private Projeto projeto;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Estudante estudante) {
        if (membros.size() < 5) {
            membros.add(estudante);
        } else {
            System.out.println("A equipe já possui 5 membros.");
        }
    }

    public List<Estudante> getMembros() {
        return membros;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        return "Equipe " + nomeEquipe + " com membros: " + membros;
    }
}
