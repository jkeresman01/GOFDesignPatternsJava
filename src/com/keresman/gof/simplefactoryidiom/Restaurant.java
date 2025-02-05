package com.keresman.gof.simplefactoryidiom;

public class Restaurant {

    private final SimpleBurgerFactory burgerFactory;

    public Restaurant() {
        this.burgerFactory = new SimpleBurgerFactory();
    }

    public Burger orderBurger(String request) {
        Burger burger =  burgerFactory.create(request);
        burger.prepare();
        return burger;
    }
}
