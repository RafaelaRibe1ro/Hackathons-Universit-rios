import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instancia;
    private List<Equipe> lista;

    private Equipes() {
        this.lista = new ArrayList<>();
    }

    public static Equipes getInstance() {
        if (instancia == null) {
            instancia = new Equipes();
        }
        return instancia;
    }

    public void adicionar(Equipe equipe) {
        lista.add(equipe);
    }

    public List<Equipe> getEquipes() {
        return lista;
    }

    public Equipe buscarPorNome(String nome) {
        for (Equipe e : lista) {
            if (e.getNomeEquipe().equalsIgnoreCase(nome)) {
                return e;
            }
        }
        return null;
    }
}
