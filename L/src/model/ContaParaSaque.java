package model;

import java.math.BigDecimal;

public abstract class ContaParaSaque extends Conta {

    public abstract void sacar(BigDecimal valor);

}
