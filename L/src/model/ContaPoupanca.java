package model;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaParaSaque {

    @Override
    public void depositar(BigDecimal valor) {
        System.out.println("[Poupança] - Realizando deposito no valor de R$" + valor);
    }

    @Override
    public void sacar(BigDecimal valor) {
        System.out.println("[Poupança] -  Realizando saque no valor de R$" + valor);
    }
}
