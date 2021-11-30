package com.company;

public class Plate extends Dish{

    double rad;
    double deep;

    public Plate(int cost, double rad, double deep) {
        super(cost);
        this.deep=deep;
        this.rad=rad;
    }

    @Override
    public double getVolume() {
        return rad*deep/10;
    }



}