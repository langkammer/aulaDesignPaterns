package comportamental.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MensagemRepository {
    private List<Mensagem> listaDeMensagen = new ArrayList<>();

    public synchronized List<Mensagem> listaDeMensagensNaoLidas() {

        return listaDeMensagen
                .stream()
                .filter(mensagem -> !mensagem.isLida())
                .collect(Collectors.toList());
    }

    public synchronized void addMensagem(final Mensagem mensagem) {
        listaDeMensagen.add(mensagem);
    }
}
