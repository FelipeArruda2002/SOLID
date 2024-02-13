package services;

import model.Compra;

public class CalculadoraDePrecos {

    /*
    * Fazendo dessa forma a cada novo frete ou tipo de cliente incluso será feito
    * novos if's deixando a classe com maior possibilidades de bugs.
    * */
    public double calcula(Compra compra, String tipoFrete, String tipoCliente) {

        double desconto = 0;
        double frete = 0;

        if ("CORREIOS".equals(tipoFrete.toUpperCase())) {
            FreteCorreios correios = new FreteCorreios();
            frete = correios.para(compra.getCidade());
        } else if ("JADLOG".equals(tipoFrete.toUpperCase())) {
            FreteJadLog jadLog = new FreteJadLog();
            frete = jadLog.para(compra.getCidade());
        }

        if ("PADRAO".equals(tipoCliente.toUpperCase())) {
            TabelaDePrecoPadrao tabelaDePrecoPadrao = new TabelaDePrecoPadrao();
            desconto = tabelaDePrecoPadrao.descontoPara(compra.getValor());
        } else if ("DIAMOND".equals(tipoCliente.toUpperCase())) {
            TabelaDePrecoDiamond diamond = new TabelaDePrecoDiamond();
            desconto = diamond.descontoPara(compra.getValor());
        }
        return compra.getValor() * (1 - desconto) + frete;
    }

}
