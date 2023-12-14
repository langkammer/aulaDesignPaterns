package comportamental.strategy;

import comportamental.strategy.Taxa.Taxa;

import java.util.Arrays;
import java.util.List;

public class MainSemStrategy {
    public static void main(String[] args) {

        List<String> produtosPassiveisIcms = Arrays.asList("Eletro", "Eletronico","Viculo");
        List<String> produtosPassiveisIpi = List.of("Eletro", "Viculo");
        List<String> produtosPassiveisIss = List.of("Prestação de Serviço");
        List<String> produtosPassiveisIpva = List.of("Viculo");

        List<Produto> listaProdutos = ProdutoRepository.listaProdutos();


        for (Produto produto : listaProdutos) {
            if (produtosPassiveisIpi.contains(produto.getTipo())) {
                Taxa taxa = new Taxa();
                taxa.setValor(produto.getValor() * 0.05);
                taxa.setNomeTaxa("IPI");
                produto.addTaxa(taxa);
            }
            if (produtosPassiveisIcms.contains(produto.getTipo())) {
                Taxa taxa = new Taxa();
                taxa.setValor(produto.getValor() * 0.30);
                taxa.setNomeTaxa("ICMS");
                produto.addTaxa(taxa);

            }
            if (produtosPassiveisIss.contains(produto.getTipo())) {
                Taxa taxa = new Taxa();
                taxa.setValor(produto.getValor() * 0.08);
                taxa.setNomeTaxa("ISS");
                produto.addTaxa(taxa);

            }
            if (produtosPassiveisIpva.contains(produto.getTipo())) {
                Taxa taxa = new Taxa();
                taxa.setValor(produto.getValor() * 0.06);
                taxa.setNomeTaxa("IPVA");
                produto.addTaxa(taxa);

            }


        }

        System.out.println("");



    }
}
