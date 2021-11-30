package com.company;

public class Cider extends Product {

    public Cider(String name) {
        super(name);
    }

    @Override
    public void buy() {
        System.out.println("Congratulations, you bought cider!");
    }
}
