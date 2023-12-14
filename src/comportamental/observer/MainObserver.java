package comportamental.observer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainObserver {
    public static void main(String[] args) {
       MensagemRepository mensagemRepository = new MensagemRepository();

       ExecutorService executor = Executors.newCachedThreadPool();

       MensagemProdutorTarefa tarefaDeProduzirMensagem = new MensagemProdutorTarefa(mensagemRepository);
       MensagemObserverTarefa mensagemObserverTarefa = new MensagemObserverTarefa(mensagemRepository);


       executor.submit(tarefaDeProduzirMensagem);
       executor.submit(mensagemObserverTarefa);

    }
}
