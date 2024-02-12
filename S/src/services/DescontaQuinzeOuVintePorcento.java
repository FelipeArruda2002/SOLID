package services;

import model.Funcionario;

public class DescontaQuinzeOuVintePorcento implements RegraDeCalculo {

    @Override
    public double calculaSalario(Funcionario funcionario) {
        if (funcionario.getSalario() <= 3000) {
            return funcionario.getSalario() * 0.85;
        } else {
            return funcionario.getSalario() * 0.8;
        }
    }
}
