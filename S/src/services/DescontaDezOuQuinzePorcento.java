package services;

import model.Funcionario;

public class DescontaDezOuQuinzePorcento implements RegraDeCalculo {

    @Override
    public double calculaSalario(Funcionario funcionario) {
        if (funcionario.getSalario() <= 2000) {
            return funcionario.getSalario() * 0.9;
        } else {
            return funcionario.getSalario() * 0.85;
        }
    }
}
