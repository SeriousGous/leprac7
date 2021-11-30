package com.company;

public class Beer extends Product {

    public Beer(String name) {
        super(name);
    }

    @Override
    public void buy() {
        System.out.println("Boo-hoo, you bought beer!");
    }
}
