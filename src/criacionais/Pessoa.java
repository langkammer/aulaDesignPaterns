package criacionais;

public class Pessoa extends PessoaAbstractFactory {
    private String nome;
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public Pessoa pessoaFactoryAbstract(String nome, String telefone) {
        return new Pessoa(nome, telefone);
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
