package com.company;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(10,20,1);
        System.out.println(plate.getVolume());

        Pot pot = new Pot(10,20,30);
        System.out.println(pot.getVolume());

        Beer beer = new Beer("Pivo");
        beer.buy();

        Cider cider = new Cider("SeedR");
        cider.buy();

    }
}