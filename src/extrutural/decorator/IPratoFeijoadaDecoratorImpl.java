package extrutural.decorator;

import extrutural.decorator.IPrato;

import java.util.Arrays;
import java.util.List;

public class IPratoFeijoadaDecoratorImpl implements IPrato {

    public static final double PRECO = 25.00;

    @Override
    public double getPreco() {
        return PRECO + (PRECO * 0.10);
    }

    @Override
    public String getNome() {
        return "Feijoada";
    }

    @Override
    public List<String> getIngredientes() {
        return Arrays.asList("Feijão", "Carne de porco", "Couve", "Arroz", "Laranja", "Pimenta");
    }
}
