package client;

import model.Funcionario;
import model.model.domain.Cargo;
import services.CalculadoraDeSalario;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Felipe", Cargo.DESENVOLVEDOR, 3000.00);
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
        double salario = calculadoraDeSalario.calcularSalario(funcionario);
        System.out.println("Salário: R$" + salario);
    }
}
