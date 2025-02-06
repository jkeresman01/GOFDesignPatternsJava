package com.keresman.gof.factorymethod;

public class Main {

    public static void main(String[] args) {
        exampleBeefBurger();
        exampleChickenBurger();
    }

    private static void exampleBeefBurger() {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.createBurger();
        System.out.printf("Ordered burger: %s\n", beefBurger );
    }

    private static void exampleChickenBurger() {
        Restaurant chickenRestaurant = new ChickenBurgerRestaurant();
        Burger chickenBurger = chickenRestaurant.createBurger();
        System.out.printf("Ordered burger: %s\n", chickenBurger );
    }
}