package extrutural.adapter;

public class MainAdataper {
    public static void main(String[] args) {

        IEnviarEmailAdapter iEnviarEmailAdapter = new IEnviarEmailAdapterImpl();


        iEnviarEmailAdapter.enviar("Teste", "Teste", "teste@teste.com.br");
    }
}
