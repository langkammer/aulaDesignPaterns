package extrutural.visitor;

public class IPreencheClienteImpl implements IPreencheCliente {
    @Override
    public void action(PedidoDomain pedidoDomain) {
        System.out.println("Preencher nome Clinete");
    }
}
