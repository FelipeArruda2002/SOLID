package services;

import model.Compra;

public class CalculadoraDePrecos {

    /*
    * Utilizando o principio aberto/fechado essa classe vai estar "fechada" para alterações
    * porém "aberta" para extensões, pois caso seja criado novos tipos de frete e tabela de preços
    * é só implementar as interfaces padronizadas.
    * */
    public double calcula(Compra compra, Frete frete, TabelaDePreco tabelaDePreco) {
        return compra.getValor() * (1 - tabelaDePreco.descontoPara(compra.getValor())) + frete.para(compra.getCidade());
    }

}
