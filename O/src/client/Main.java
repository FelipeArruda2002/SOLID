package client;

import model.Compra;
import services.CalculadoraDePrecos;

public class Main {

    public static void main(String[] args) {

        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos();
        Compra compra = new Compra(5000, "Blumenau");
        System.out.println("Compra: R$" + calculadoraDePrecos.calcula(compra, "JADLOG", "DIAMOND"));
    }
}
