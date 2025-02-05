package com.keresman.gof.simplefactoryidiom;

public class SimpleBurgerFactory {

    public Burger create(String type){
        if(type.equalsIgnoreCase("beef")){
            return new BeefBurger("Cheese", false);
        }

        return new ChickenBurger("Cheese", false);
    }
}
