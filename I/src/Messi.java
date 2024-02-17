public class Messi implements JogadorCanhoto, BatedorDePenalti, BatedorDeFalta {

    @Override
    public void chutarDeEsquerda() {
        System.out.println("Chutando de esquerda!");
    }

    @Override
    public void baterFalta() {
        System.out.println("Batendo falta!");
    }

    @Override
    public void baterPenalti() {
        System.out.println("Batendo Penalti! Obrigado Neymar");
    }
}
