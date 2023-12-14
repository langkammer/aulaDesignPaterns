package criacionais;

public class Animal {
    private String nome;
    private String raca;
    private String cor;

    private Animal() {

    }

    public Animal comRaca(final String raca) {
        this.raca = raca;
        return this;
    }

    public Animal comCor(final String cor) {
        this.cor = cor;
        return this;
    }
    public Animal comNome(final String nome) {
        this.nome = nome;
        return this;
    }

    public static Animal builder() {
        return new Animal();
    }


    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }
}
