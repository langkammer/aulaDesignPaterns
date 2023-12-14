package extrutural.proxy;

import extrutural.proxy.IProxyInternet;
import extrutural.proxy.IProxyInternetImpl;

public class MainProxy {
    public static void main(String[] args) throws Exception {
        IProxyInternet proxyInternet = new IProxyInternetImpl();
        proxyInternet.conectar("teste", "teste");
    }
}
