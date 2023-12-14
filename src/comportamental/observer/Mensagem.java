package comportamental.observer;

public class Mensagem {
    private String titulo;
    private boolean lida;

    public Mensagem(String titulo) {
        this.titulo = titulo;
        this.lida = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }
}
