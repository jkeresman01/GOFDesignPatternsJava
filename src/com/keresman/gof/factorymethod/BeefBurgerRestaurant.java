package com.keresman.gof.factorymethod;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger("Cheese", true);
    }
}
