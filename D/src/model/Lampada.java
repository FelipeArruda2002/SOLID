package model;

public class Lampada {

    private boolean ligado;

    public void acionar() {
        if (this.ligado) {
            desligar();
        } else {
            ligar();
        }
    }

    public void ligar() {
        System.out.println("Ligando lampada");
        setLigado(true);
    }

    public void desligar() {
        System.out.println("Desligando lampada");
        setLigado(false);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
