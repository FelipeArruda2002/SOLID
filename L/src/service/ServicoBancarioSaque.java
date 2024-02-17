package service;

import model.ContaParaSaque;

import java.math.BigDecimal;

public class ServicoBancarioSaque {

    private ContaParaSaque conta;

    public ServicoBancarioSaque(ContaParaSaque conta) {
        this.conta = conta;
    }

    public void sacar(BigDecimal valor) {
        conta.sacar(valor);
    }
}
