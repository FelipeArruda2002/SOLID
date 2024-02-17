package model;

import java.math.BigDecimal;

public class ContaDepositoPrazoFixo extends Conta {

    @Override
    public void depositar(BigDecimal valor) {
        System.out.println("[Conta Depósito] - Realizando deposito no valor de R$" + valor);
    }
}
