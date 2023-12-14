package comportamental.strategy;

import comportamental.strategy.Taxa.Taxa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produto {

    private String nome;
    private TipoProdutoEnum tipo;
    private boolean nacional;
    private Double valor;

    private List<Taxa> listaTaxas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoProdutoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoProdutoEnum tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public void addTaxa(final Taxa taxa) {
        if (Objects.nonNull(taxa)) {
            this.listaTaxas.add(taxa);
        }
    }

    public double getValorTaxaAdicional() {
        return this.isNacional() ? this.getTipo().getTaxaNacional() : this.getTipo().getTaxaInternacional();
    }

    public List<TipoImpostoEnum> getListaImpostos() {
        return TipoImpostoEnum.listDeImpostosDoTipoProduto(this.getTipo());
    }
}
