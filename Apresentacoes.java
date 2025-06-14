import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instancia;
    private List<Apresentacao> lista;

    private Apresentacoes() {
        this.lista = new ArrayList<>();
    }

    public static Apresentacoes getInstance() {
        if (instancia == null) {
            instancia = new Apresentacoes();
        }
        return instancia;
    }

    public void adicionar(Apresentacao apresentacao) {
        lista.add(apresentacao);
    }

    public List<Apresentacao> getApresentacoes() {
        return lista;
    }
}
