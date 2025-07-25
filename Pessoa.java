public class Pessoa {
    private String nome;
    private Instituicao instituicao;

    public Pessoa(String nome, Instituicao instituicao) {
        this.nome = nome;
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    @Override
    public String toString() {
        return nome + " - " + instituicao.getNome();
    }
}
