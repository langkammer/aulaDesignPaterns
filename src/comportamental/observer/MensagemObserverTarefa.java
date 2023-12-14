package comportamental.observer;

public class MensagemObserverTarefa implements Runnable {

    public MensagemRepository mensagemRepository;

    public MensagemObserverTarefa(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    @Override
    public void run() {
        while (true) {
            mensagemRepository
                    .listaDeMensagensNaoLidas()
                    .forEach(mensagem ->  {
                        System.out.println("Mensagem Consumida " + mensagem.getTitulo());
                        mensagem.setLida(true);
                    });
            dormir();
        }
    }

    private static void dormir() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
