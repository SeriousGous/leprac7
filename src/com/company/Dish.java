package com.company;

public abstract class Dish {
    protected int cost;

    public Dish(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getVolume();
}