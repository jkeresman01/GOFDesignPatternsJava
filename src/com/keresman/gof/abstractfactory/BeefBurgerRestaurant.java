package com.keresman.gof.abstractfactory;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger( "Cheese", true);
    }
}
