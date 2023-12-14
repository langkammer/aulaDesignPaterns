package extrutural.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        IPrato prato = null;
        prato = new IPratoFeijoadaDecoratorImpl();
        imprimir(prato);
        prato = new IPratoLasanhaDecoratorImpl();
        imprimir(prato);
        prato = new IPratoBatataFritaDecoratorImpl();
        imprimir(prato);

    }

    private static void imprimir(IPrato prato) {
        System.out.println("Nome do Prato é : " + prato.getNome() );
        System.out.println( "Valor R$ " + prato.getPreco());
        System.out.println("Lista de Ingredientes " + prato.getIngredientes().toString());
    }
}
