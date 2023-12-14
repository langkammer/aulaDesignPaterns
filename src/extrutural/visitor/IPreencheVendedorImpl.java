package extrutural.visitor;

public class IPreencheVendedorImpl implements IPreencheVendedor {
    @Override
    public void action(PedidoDomain pedidoDomain) {
        System.out.println("Preencher nome Vendedor");

    }
}
