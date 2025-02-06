package com.keresman.gof.bridge;

public class VeggiePizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: " + toppings);
        System.out.println("Adding cheese");
    }

    @Override
    public void quicklyCheck() {
        System.out.println("Crust is " + crust);
    }
}
