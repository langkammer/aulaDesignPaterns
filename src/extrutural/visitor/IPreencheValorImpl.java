package extrutural.visitor;

public class IPreencheValorImpl implements IPreencheValor {
    @Override
    public void action(PedidoDomain pedidoDomain) {
        System.out.println("Preencher Valor Pedido");

    }
}
