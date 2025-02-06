package com.keresman.gof.bridge;

public abstract class Restaurant {

    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    protected abstract void addSauce();
    protected abstract void addToppings();
    protected abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.quicklyCheck();
        System.out.println("Ordering in progress...");
    }
}
