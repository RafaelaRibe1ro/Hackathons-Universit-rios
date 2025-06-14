public class Sala {
    private String nome;
    private String localizacao;

    public Sala(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String toString() {
        return nome + " - " + localizacao;
    }
}
