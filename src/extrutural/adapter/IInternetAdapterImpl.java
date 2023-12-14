package extrutural.adapter;

import extrutural.adapter.IInternetAdapter;

public class IInternetAdapterImpl implements IInternetAdapter {
    @Override
    public void conectar() {
        System.out.println("Conectado!");
    }
}
