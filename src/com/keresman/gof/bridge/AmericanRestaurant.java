package com.keresman.gof.bridge;

public class AmericanRestaurant extends Restaurant {

    protected AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        pizza.setSauce("-");
    }

    @Override
    protected void addToppings() {
        pizza.setToppings("Oil");
    }

    @Override
    protected void makeCrust() {
        pizza.setCrust("Thin");
    }
}
