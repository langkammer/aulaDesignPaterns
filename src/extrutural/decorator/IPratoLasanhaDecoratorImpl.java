package extrutural.decorator;

import extrutural.decorator.IPrato;

import java.util.Arrays;
import java.util.List;

public class IPratoLasanhaDecoratorImpl implements IPrato {

    public static final double PRECO = 35.00;

    @Override
    public double getPreco() {
        return PRECO + (PRECO * 0.12);
    }

    @Override
    public String getNome() {
        return "Lasanha";
    }

    @Override
    public List<String> getIngredientes() {
        return Arrays.asList("Massa", "Carne Moida", "Molho de Tomate", "Arroz");
    }
}
