package client;

import model.ContaAtual;
import model.ContaDepositoPrazoFixo;
import model.ContaPoupanca;
import service.ServicoBancarioSaque;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        ServicoBancarioSaque servico = new ServicoBancarioSaque(new ContaAtual());
        servico.sacar(new BigDecimal(1000));

        servico = new ServicoBancarioSaque(new ContaPoupanca());
        servico.sacar(new BigDecimal(500));

        /**
         * Com o serviço bancário de saque recebendo somente contas
         * que realizam saque, ele pode confiar em seus subtipos.
         */

        ContaDepositoPrazoFixo contaDeposito = new ContaDepositoPrazoFixo();
        contaDeposito.depositar(new BigDecimal(450));
    }
}
