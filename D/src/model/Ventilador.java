package model;

public class Ventilador extends Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Ligando Ventilador");
        setLigado(true);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Ventilador");
        setLigado(false);
    }
}
