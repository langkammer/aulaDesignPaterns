package comportamental.command;

public class MainCommand {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.cliente = "Teste";
        pedido.produto = "TEste";
        pedido.vendedor = "teste";

        PedidoCommand pedidoCommand = new PedidoCommand();
        pedidoCommand.command(pedido);
    }
}
