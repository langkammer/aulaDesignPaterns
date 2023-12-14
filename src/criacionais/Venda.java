package criacionais;

public class Venda {
    private String nomeVendedor;
    private String nomeCliente;

    private Venda() {

    }

    public static Venda getInstance() {
        return new Venda();
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
