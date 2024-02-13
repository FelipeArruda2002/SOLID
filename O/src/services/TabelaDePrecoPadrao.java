package services;

public class TabelaDePrecoPadrao implements TabelaDePreco {

    public double descontoPara(double valor) {
        if (valor <= 1000) {
            return 0;
        } else if (valor <= 5000) {
            return 0.03;
        }
        return 0.05;
    }
}
