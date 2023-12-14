package comportamental.strategy;

import java.util.Arrays;
import java.util.List;

public class ProdutoRepository {

    public static List<Produto> listaProdutos() {
        Produto tv = new Produto();
        tv.setValor(1500.00);
        tv.setNacional(true);
        tv.setNome("Televisão Lg");
        tv.setTipo(TipoProdutoEnum.ELETRONICO);

        Produto smarthPhone = new Produto();
        smarthPhone.setValor(5000.00);
        smarthPhone.setNome("Iphone");
        smarthPhone.setNacional(true);
        smarthPhone.setTipo(TipoProdutoEnum.ELETRONICO);

        Produto fogao = new Produto();
        fogao.setValor(2000.00);
        fogao.setNome("Fogão");
        fogao.setNacional(true);
        fogao.setTipo(TipoProdutoEnum.ELETRO);


        Produto maquinaLavar = new Produto();
        maquinaLavar.setValor(4000.00);
        maquinaLavar.setNome("Maquina de Lavar");
        maquinaLavar.setNacional(true);
        maquinaLavar.setTipo(TipoProdutoEnum.ELETRONICO);

        Produto microOndas = new Produto();
        microOndas.setValor(450.00);
        microOndas.setNome("Micro Ondas");
        microOndas.setNacional(true);
        microOndas.setTipo(TipoProdutoEnum.ELETRONICO);

        Produto computador = new Produto();
        computador.setValor(7050.00);
        computador.setNome("Computador");
        computador.setNacional(false);
        computador.setTipo(TipoProdutoEnum.ELETRONICO);

        Produto servico = new Produto();
        servico.setValor(300.00);
        servico.setNome("Prestação de Serviço Instalação de Ar Condicionado");
        servico.setNacional(true);
        servico.setTipo(TipoProdutoEnum.PRESTACAO_DE_SERVICO);

        Produto carro = new Produto();
        carro.setValor(50000.00);
        carro.setNome("Onix LTZ");
        carro.setNacional(true);
        carro.setTipo(TipoProdutoEnum.VEICULO);


        return Arrays.asList(tv, smarthPhone, fogao, maquinaLavar, microOndas, computador, carro, servico);
    }
}
