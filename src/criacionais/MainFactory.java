package criacionais;

public class MainFactory {

    public static void main(String[] args) {

        Cliente clienteFactoryMethod = Cliente.clienteFactoryMethod("Robson", "Teste");

        System.out.println(clienteFactoryMethod.getNome());

        Pessoa pessoaAbstractFactory = new Pessoa();

        Pessoa pessoaCriadaPeloFActoryAbstrado = pessoaAbstractFactory.pessoaFactoryAbstract("Robson", "Teste");

        System.out.println(pessoaCriadaPeloFActoryAbstrado.getNome());


        Venda venda = Venda.getInstance();

        venda.setNomeCliente("Robson");
        venda.setNomeVendedor("Vendedor");

        System.out.println(venda.getNomeCliente() +  " " + venda.getNomeVendedor());

        Animal animal = Animal.builder()
                .comNome("Rex")
                .comRaca("SRD")
                .comCor("Branco");

        System.out.println(animal.getNome());
        System.out.println(animal.getCor());
        System.out.println(animal.getRaca());



    }
}
