package comportamental.strategy;

import comportamental.strategy.impl.ICalcularImpostoIcmsImpl;
import comportamental.strategy.impl.ICalcularImpostoIpiImpl;
import comportamental.strategy.impl.ICalcularImpostoIpvaImpl;
import comportamental.strategy.impl.ICalcularImpostoIssImpl;

import java.util.HashMap;
import java.util.Optional;

import static comportamental.strategy.TipoImpostoEnum.*;

public class CalculaImpostoStrategy {
    private final HashMap<TipoImpostoEnum, ICalcularImposto> MAP = new HashMap<>();

    public CalculaImpostoStrategy() {
        MAP.put(ICMS, new ICalcularImpostoIcmsImpl());
        MAP.put(IPI, new ICalcularImpostoIpiImpl());
        MAP.put(ISS, new ICalcularImpostoIssImpl());
        MAP.put(IPVA, new ICalcularImpostoIpvaImpl());
    }

    public void calcular(final Produto produto) {
        produto.getListaImpostos()
                .forEach(imposto -> {
                    Optional.ofNullable(MAP.get(imposto))
                            .ifPresent(iCalcularImposto -> iCalcularImposto.calcula(produto));
                });
    }
}
