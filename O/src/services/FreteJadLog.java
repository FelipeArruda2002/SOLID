package services;

public class FreteJadLog implements Frete {

    public double para(String cidade) {
        if ("SÃO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        } else if ("RIO DE JANEIRO".equals(cidade.toUpperCase())) {
            return 30;
        }
        return 45;
    }
}
