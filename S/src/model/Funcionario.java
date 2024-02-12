package model;

import model.model.domain.Cargo;

public class Funcionario {

    private String nome;
    private Cargo cargo;
    private Double salario;

    public Funcionario(String nome, Cargo cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }
}
