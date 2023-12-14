package comportamental.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Carro 1");
        lista.add("Carro 2");
        lista.add("Carro 3");

        Iterator<String> iteratorCarro = lista.iterator();

        while (iteratorCarro.hasNext()) {
            String carro = iteratorCarro.next();
            System.out.println(carro);
        }


    }
}
