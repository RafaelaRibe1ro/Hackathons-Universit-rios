import java.util.HashMap;
import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Banca(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = new HashMap<>();
    }

    public void adicionarNota(Jurado jurado, int nota) {
        if (jurados.size() < 4) {
            jurados.put(jurado, nota);
        } else {
            System.out.println("A banca já possui 4 jurados com notas.");
        }
    }

    @Override
    public void calcularNotaFinal() {
        if (jurados.isEmpty()) {
            System.out.println("Nenhuma nota registrada.");
            return;
        }

        int soma = 0;
        for (int nota : jurados.values()) {
            soma += nota;
        }
        int media = soma / jurados.size();
        projetoAvaliado.setNotaFinal(media);
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }
}
