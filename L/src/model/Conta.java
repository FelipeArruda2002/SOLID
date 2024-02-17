package model;

import java.math.BigDecimal;

public abstract class Conta {

    public abstract void depositar(BigDecimal valor);

    public abstract void sacar(BigDecimal valor);

}
