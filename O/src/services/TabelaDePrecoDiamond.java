package services;

public class TabelaDePrecoDiamond {

    public double descontoPara(double valor) {
        if (valor <= 1000) {
            return 0.03;
        } else if (valor <= 5000) {
            return 0.05;
        }
        return 0.1;
    }

}
