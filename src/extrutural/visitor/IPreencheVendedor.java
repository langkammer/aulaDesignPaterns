package extrutural.visitor;

import extrutural.visitor.PedidoDomain;

@FunctionalInterface
public interface IPreencheVendedor {
    void action(final PedidoDomain pedidoDomain);
}
