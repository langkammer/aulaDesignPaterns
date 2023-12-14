package comportamental.observer;

public class MensagemProdutorTarefa implements Runnable {

    public MensagemRepository mensagemRepository;

    public MensagemProdutorTarefa(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }
    @Override
    public void run() {
        Integer contador = -1;
        while (true) {
            contador ++;
            Mensagem mensagem = new Mensagem("Titulo Nº " + contador);
            mensagemRepository.addMensagem(mensagem);
            System.out.println("Mensagem Enviada :: " + mensagem.getTitulo());
            dormir();
        }
    }

    private static void dormir() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
