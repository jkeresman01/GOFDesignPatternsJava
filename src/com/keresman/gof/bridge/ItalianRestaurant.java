package com.keresman.gof.bridge;

public class ItalianRestaurant extends Restaurant {

   public ItalianRestaurant(Pizza pizza) {
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
