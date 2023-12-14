package extrutural.visitor;

import extrutural.visitor.PedidoDomain;

@FunctionalInterface
public interface IPreencheCliente {
    void action(final PedidoDomain pedidoDomain);
}
