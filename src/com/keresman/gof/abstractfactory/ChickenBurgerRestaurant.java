package com.keresman.gof.abstractfactory;

public class ChickenBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new ChickenBurger( "Cheese", false);
    }
}
