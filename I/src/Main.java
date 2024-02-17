public class Main {

    public static void main(String[] args) {

        System.out.println("=== Cristiano Ronaldo ===");
        CristianoRonaldo cr7 = new CristianoRonaldo();
        cr7.baterFalta();
        cr7.baterPenalti();
        cr7.cabecear();
        cr7.chutarDeDireita();
        cr7.chutarDeEsquerda();

        System.out.println("=== Messi ===");
        Messi messi = new Messi();
        messi.baterFalta();
        messi.baterPenalti();
        messi.chutarDeEsquerda();

    }
}
