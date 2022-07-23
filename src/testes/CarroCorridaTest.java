package testes;

import models.CarroCorrida;

public class CarroCorridaTest {

    public static void main(String[] args) {

        var ferrari = new CarroCorrida();
        ferrari.setFerrari("ferrari");

        var mercedes = new CarroCorrida();
        mercedes.setMercedes("mercedes");

        var redbull = new CarroCorrida();
        redbull.setRedBull("redbull");

        System.out.println("ferrari é um carro de corrida" );
        System.out.println("mercedes tmb é um carro de corrida" );

    }
}
