package comportamental.command;

public class PedidoCommand implements ICommand {

    @Override
    public void command(Object contexto) {
        Pedido pedido = (Pedido) contexto;


        InclusaoPedido inclusaoPedido = new InclusaoPedido();
        Faturar faturar = new Faturar();
        EmissaoNotafiscal emissaoNotafiscal = new EmissaoNotafiscal();
        SeparaEstoque separaEstoque = new SeparaEstoque();



        inclusaoPedido.incluir(pedido);
        faturar.faturar(pedido);
        emissaoNotafiscal.emitir(pedido);
        separaEstoque.separar(pedido);
    }
}
