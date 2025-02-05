package com.keresman.gof.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.createBurger();
        System.out.printf("Ordered burger: %s\n", beefBurger );

        Restaurant chickenRestaurant = new ChickenBurgerRestaurant();
        Burger chickenBurger = chickenRestaurant.createBurger();
        System.out.printf("Ordered burger: %s\n", chickenBurger );
    }
}