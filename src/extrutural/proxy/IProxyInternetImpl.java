package extrutural.proxy;

import extrutural.adapter.IInternetAdapter;
import extrutural.adapter.IInternetAdapterImpl;

import java.util.Objects;

public class IProxyInternetImpl implements IProxyInternet {
    @Override
    public void conectar(String usuario, String senha) throws Exception {
        if (Objects.nonNull(usuario)
                && Objects.equals(usuario, "teste")
                && Objects.nonNull(senha)
                && Objects.equals(senha, "teste")
        ) {
            IInternetAdapter iInternetAdapter = new IInternetAdapterImpl();
            iInternetAdapter.conectar();
        } else {
            throw new Exception("Usuario e senha nulos ou não validos!");
        }
    }
}
