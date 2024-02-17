package service;

import model.Conta;

import java.math.BigDecimal;

public class ServicoBancarioSaque {

    private Conta conta;

    public ServicoBancarioSaque(Conta conta) {
        this.conta = conta;
    }

    public void sacar(BigDecimal valor) {
        conta.sacar(valor);
    }
}
