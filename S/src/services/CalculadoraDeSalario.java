package services;

import model.Funcionario;
import model.model.domain.Cargo;

public class CalculadoraDeSalario {

    public double calcularSalario(Funcionario funcionario) {
        if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return descontaDezOuQuinzePorcento(funcionario);
        } else if (Cargo.ENGENHEIRO.equals(funcionario.getCargo())) {
            return descontaQuinzeOuVintePorcento(funcionario);
        }

        // A classe irá crescer a cada vez que um novo cargo
        // for adicionado

        return funcionario.getSalario();
    }

    private double descontaDezOuQuinzePorcento(Funcionario funcionario) {
            if (funcionario.getSalario() <= 2000) {
            return funcionario.getSalario() * 0.9;
        } else {
            return funcionario.getSalario() * 0.85;
        }
    }

    private double descontaQuinzeOuVintePorcento(Funcionario funcionario) {
        if (funcionario.getSalario() <= 3000) {
            return funcionario.getSalario() * 0.85;
        } else {
            return funcionario.getSalario() * 0.8;
        }
    }
}
