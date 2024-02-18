package model;

public class Lampada extends Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Ligando Lâmpada");
        setLigado(true);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Lâmpada");
        setLigado(false);
    }
}
