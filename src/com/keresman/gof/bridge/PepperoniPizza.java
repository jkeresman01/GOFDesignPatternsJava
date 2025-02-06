package com.keresman.gof.bridge;

public class PepperoniPizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: " + toppings);
        System.out.println("Adding pepperoni");
    }

    @Override
    public void quicklyCheck() {
        System.out.println("Crust is " + crust);
    }
}
