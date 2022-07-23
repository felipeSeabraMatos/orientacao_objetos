package testes;

import models.Carro;

public class CarroTest {
    public static void main(String[] args) {

//        Carro fiat = new Carro();
//        fiat.setMarca("FIAT");
//        fiat.setModelo("PALIO");
//
//        Carro Wolks = new Carro();
//        Wolks.setMarca("Wolks");
//        Wolks.setModelo("gol");

        var fiat = new Carro();
        fiat.setMarca("FIAT");
        fiat.setModelo("PALIO");

        var Wolks = new Carro();
        Wolks.setMarca("Wolks");
        Wolks.setModelo("gol");

        System.out.println("Carro fiat marca " + fiat.getMarca() + " modelo " + fiat.getModelo());
        System.out.println();
        System.out.println("Carro Wolks marca " +  Wolks.getMarca() + " modelo " + Wolks.getModelo());
    }
}
