package client;

import model.Interruptor;
import model.Lampada;

public class Main {

    public static void main(String[] args) {
        Interruptor interruptor = new Interruptor(new Lampada());
        interruptor.acionar();
        interruptor.acionar();
    }
}
