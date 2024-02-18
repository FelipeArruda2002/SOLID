package client;

import model.Interruptor;
import model.Lampada;
import model.Ventilador;

public class Main {

    public static void main(String[] args) {
        Interruptor interruptor = new Interruptor(new Lampada());
        interruptor.acionar();
        interruptor.acionar();

        interruptor = new Interruptor(new Ventilador());
        interruptor.acionar();
        interruptor.acionar();
    }
}
