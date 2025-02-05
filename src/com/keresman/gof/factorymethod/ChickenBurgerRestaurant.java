package com.keresman.gof.factorymethod;

public class ChickenBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new ChickenBurger("Cheese", false);
    }
}
