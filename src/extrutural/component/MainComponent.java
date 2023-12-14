package extrutural.component;

import extrutural.decorator.IPratoBatataFritaDecoratorImpl;
import extrutural.decorator.IPratoFeijoadaDecoratorImpl;
import extrutural.decorator.IPratoLasanhaDecoratorImpl;

public class MainComponent {

    public static void main(String[] args) {
        Prato prato = new Prato();

        prato.addImplDePratos(new IPratoFeijoadaDecoratorImpl());
        prato.addImplDePratos(new IPratoLasanhaDecoratorImpl());
        prato.addImplDePratos(new IPratoBatataFritaDecoratorImpl());

        prato.show();
    }
}
