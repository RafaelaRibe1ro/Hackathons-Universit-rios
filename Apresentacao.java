import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Banca banca;
    private LocalDateTime dataHora;
    private Sala local;

    public Apresentacao(Projeto projeto, Banca banca, LocalDateTime dataHora, Sala local) {
        this.projeto = projeto;
        this.banca = banca;
        this.dataHora = dataHora;
        this.local = local;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Banca getBanca() {
        return banca;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Sala getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return "Apresentação do projeto \"" + projeto.getTitulo() +
               "\" em " + dataHora +
               " na sala " + local;
    }
}
