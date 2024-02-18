package model;

public class Interruptor {

    /**
     * Dessa forma a classe Interruptor depende de uma interface
     */
    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void acionar() {
        dispositivo.acionar();
    }
}
