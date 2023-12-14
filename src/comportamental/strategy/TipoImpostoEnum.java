package comportamental.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static comportamental.strategy.TipoProdutoEnum.*;

public enum TipoImpostoEnum {
    ICMS(0.30, Arrays.asList(ELETRO, ELETRONICO, VEICULO)),
    IPI(0.05, Arrays.asList(ELETRO, VEICULO)),
    IPVA(0.06, Arrays.asList(VEICULO)),
    ISS(0.08, Arrays.asList(PRESTACAO_DE_SERVICO));

    private List<TipoProdutoEnum> listaDeProdutos;
    private double taxa;

    TipoImpostoEnum(double taxa, List<TipoProdutoEnum> listaDeProdutos) {
        this.taxa = taxa;
        this.listaDeProdutos = listaDeProdutos;
    }

    public List<TipoProdutoEnum> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public double getTaxa() {
        return taxa;
    }

    public static List<TipoImpostoEnum> listDeImpostosDoTipoProduto(final TipoProdutoEnum tipoProdutoEnum) {
        return Arrays.stream(values())
                .filter(imposto -> imposto.getListaDeProdutos().contains(tipoProdutoEnum))
                .collect(Collectors.toList());
    }

}
