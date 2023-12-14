package extrutural.decorator;

import extrutural.decorator.IPrato;

import java.util.Arrays;
import java.util.List;

public class IPratoBatataFritaDecoratorImpl implements IPrato {

    public static final double PRECO = 15.00;

    @Override
    public double getPreco() {
        return PRECO + (PRECO * 0.05);
    }

    @Override
    public String getNome() {
        return "Batata Frita";
    }

    @Override
    public List<String> getIngredientes() {
        return Arrays.asList("Batatas");
    }
}
