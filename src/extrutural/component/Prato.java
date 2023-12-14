package extrutural.component;

import extrutural.component.Component;
import extrutural.decorator.IPrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prato implements Component {

    private List<IPrato> listaDePratos = new ArrayList<>();

    public void addImplDePratos(IPrato prato) {
        if (Objects.nonNull(prato)) {
            listaDePratos.add(prato);
        }
    }
    @Override
    public void show() {
        listaDePratos.forEach(prato -> {
            System.out.println(prato.getNome());
        });
    }
}
