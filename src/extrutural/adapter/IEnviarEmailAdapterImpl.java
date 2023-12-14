package extrutural.adapter;

import extrutural.adapter.IEnviarEmailAdapter;

public class IEnviarEmailAdapterImpl implements IEnviarEmailAdapter {
    @Override
    public void enviar(String msg, String conteudo, String para) {
        System.out.println("Enviando email para " + para);

        System.out.println("Email enviado !");
    }
}
