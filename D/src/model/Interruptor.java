package model;

public class Interruptor {

    /**
     * No principio de inversão de dependência diz que
     * devemos depender de abstrações e não de implementações.
     * Nesse exemplo a classe Interruptor fica "Refém" da classe Lampada
     * sendo que qualquer alteração na classe Lampada pode alterar o comportamneto
     * da classe Interruptor
     */
    private Lampada lampada;

    public Interruptor(Lampada lampada) {
        this.lampada = lampada;
    }

    public void acionar() {
        lampada.acionar();
    }
}
