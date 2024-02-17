public class Messi implements JogadorCompleto {

    @Override
    public void chutarDeEsquerda() {
        System.out.println("Chutando de esquerda!");
    }

    @Override
    public void chutarDeDireita() {
        throw new UnsupportedOperationException("EU NÃO SEIII");
    }

    @Override
    public void cabecear() {
        throw new UnsupportedOperationException("EU NÃO SEIII");
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
