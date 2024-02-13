package services;

public class FreteCorreios implements Frete {

    public double para(String cidade) {
        if ("SÃO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
