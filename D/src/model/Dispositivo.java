package model;

public abstract class Dispositivo {

    protected boolean ligado;

    public void acionar() {
        if (isLigado()) {
            desligar();
        } else {
            ligar();
        }
    }

    public abstract void ligar();

    public abstract void desligar();

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
