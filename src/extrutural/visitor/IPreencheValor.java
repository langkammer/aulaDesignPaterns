package extrutural.visitor;

import extrutural.visitor.PedidoDomain;

@FunctionalInterface
public interface IPreencheValor {
    void action(final PedidoDomain pedidoDomain);
}
