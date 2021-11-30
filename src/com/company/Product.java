package com.company;

public abstract class Product {

    protected String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract void buy();

}