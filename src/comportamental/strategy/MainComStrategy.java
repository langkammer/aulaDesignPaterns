package comportamental.strategy;

import java.util.List;

public class MainComStrategy {

    public static void main(String[] args) {
        List<Produto> listaProdutos = ProdutoRepository.listaProdutos();
        CalculaImpostoStrategy calculaImpostoStrategy = new CalculaImpostoStrategy();
        listaProdutos.forEach(calculaImpostoStrategy::calcular);
        System.out.println("Teste");
    }
}
