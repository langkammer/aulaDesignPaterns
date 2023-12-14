package criacionais;

public class Cliente  {
    private String nome;
    private String telefone;

    private Cliente() {

    }
    private Cliente(final String nome, final String telefone) {
        this.telefone = telefone;
        this.nome = nome;
    }

    public static Cliente clienteFactoryMethod(final String nome, final String telefone) {
        return new Cliente(nome, telefone);
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
