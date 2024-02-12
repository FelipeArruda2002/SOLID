package services;

import model.Funcionario;

public class CalculadoraDeSalario {

    // Utilizando o princípio de responsabilidade única
    // essa clase não irá crescer, caso a empresa mais pra frente
    // crie uma nova regra de cálculo, será necessário somente
    // criar outra classe que implemente a interface RegraCalculo
    public static double calcularSalario(Funcionario funcionario) {
       return funcionario.calculaSalario();
    }
}
