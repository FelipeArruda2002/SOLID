package model;

import java.math.BigDecimal;

public class ContaDepositoPrazoFixo extends Conta {

    @Override
    public void depositar(BigDecimal valor) {
        System.out.println("Realizando deposito no valor de R$" + valor);
    }

    /**
     * Classe viola o principio de substituição de Liskov
     * Esse principio diz que um subtipo possa ser substituido pelo SUPERtipo.
     *
     * O supertipo não está preparado para receber uma exceção, nesse caso d
     * desancadeava uma serie de erros no cliente.
     * @param valor
     */
    @Override
    public void sacar(BigDecimal valor) {
        throw new UnsupportedOperationException("Saques não são suportados pela Conta de depósito a prazo fixo!!");
    }
}
