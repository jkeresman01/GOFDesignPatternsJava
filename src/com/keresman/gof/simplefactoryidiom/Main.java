package com.keresman.gof.simplefactoryidiom;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        exampleChickenBurger(restaurant);
        exampleBeefBurger(restaurant);
    }

    private static void exampleChickenBurger(Restaurant restaurant) {
        Burger burger = restaurant.orderBurger("chicken");
        System.out.printf("Ordered burger: %s\n", burger);
    }

    private static void exampleBeefBurger(Restaurant restaurant) {
        Burger burger = restaurant.orderBurger("beef");
        System.out.printf("Ordered burger: %s\n", burger);
    }
}