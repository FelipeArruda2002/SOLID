package model;

import java.math.BigDecimal;

public class ContaAtual extends ContaParaSaque {

    @Override
    public void depositar(BigDecimal valor) {
        System.out.println("Realizando deposito no valor de R$" + valor);
    }

    @Override
    public void sacar(BigDecimal valor) {
        System.out.println("Realizando saque no valor de R$" + valor);
    }
}
