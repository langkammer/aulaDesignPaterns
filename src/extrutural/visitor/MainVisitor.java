package extrutural.visitor;

public class MainVisitor {
    public static void main(String[] args) {
        PedidoDomain pedidoDomain = PedidoDomain.builder();

        IPreencheVendedor preencheVendedor = new IPreencheVendedorImpl();
        IPreencheCliente preencheCliente = new IPreencheClienteImpl();
        IPreencheValor iPreencheValor = new IPreencheValorImpl();

        pedidoDomain.visitor(preencheVendedor::action);
        pedidoDomain.visitor(preencheCliente::action);
        pedidoDomain.visitor(iPreencheValor::action);

    }
}
