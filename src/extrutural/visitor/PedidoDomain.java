package extrutural.visitor;

import criacionais.Animal;

import java.util.function.Consumer;

public class PedidoDomain {
    private double valor;
    private String vendedor;
    private String cliente;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public PedidoDomain() {
    }

    public static PedidoDomain builder() {
        return new PedidoDomain();
    }

    public PedidoDomain comCliente(final String nomeCliente) {
        this.cliente = nomeCliente;
        return this;
    }

    public PedidoDomain comValor(final double valor) {
        this.valor = valor;
        return this;
    }

    public PedidoDomain comVendedor(final String vendedor) {
        this.vendedor = vendedor;
        return this;
    }


    public void visitor(Consumer<PedidoDomain> consumer) {
        consumer.accept(this);
    }
}
