package comportamental.strategy.impl;

import comportamental.strategy.ICalcularImposto;
import comportamental.strategy.Produto;
import comportamental.strategy.Taxa.Taxa;
import comportamental.strategy.TipoImpostoEnum;

public class ICalcularImpostoIpiImpl implements ICalcularImposto {
    @Override
    public void calcula(Produto produto) {
        Taxa taxa = new Taxa();
        taxa.setValor(produto.getValor() * TipoImpostoEnum.IPI.getTaxa());
        taxa.setNomeTaxa("IPI");
        produto.addTaxa(taxa);
    }
}
