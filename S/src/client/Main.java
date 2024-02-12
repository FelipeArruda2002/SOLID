package client;

import model.Funcionario;
import model.model.domain.Cargo;
import services.CalculadoraDeSalario;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Felipe", Cargo.DESENVOLVEDOR, 3000.00);
        double salario = CalculadoraDeSalario.calcularSalario(funcionario);
        System.out.println("Salário: R$" + salario);
    }
}
