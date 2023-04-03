package br.com.catolica.Main;
import java.util.Scanner;
import br.com.catolica.Model.Carro;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro(
                "Camaro",
                "70's",
                "PRETO",
                2020
        );

        System.out.println(carro);

        System.out.println("Quanto deseja acelerar? ");
        carro.acelerar(scanner.nextInt());

        System.out.println("Quanto deseja reduzir? ");
        carro.reduzir(scanner.nextInt());

        System.out.println("Quanto deseja frear? ");
        carro.frear(scanner.nextInt());
    }
}