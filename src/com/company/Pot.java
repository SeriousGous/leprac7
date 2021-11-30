package com.company;

public class Pot extends Dish {
    double rad;
    double deep;

    public Pot(int cost, double rad, double deep) {
        super(cost);
        this.rad = rad;
        this.deep = deep;
    }

    @Override
    public double getVolume() {
        return rad * deep;
    }
}
