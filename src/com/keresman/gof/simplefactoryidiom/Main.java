package com.keresman.gof.simplefactoryidiom;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Burger burger = restaurant.orderBurger("chicken");
        System.out.printf("Ordered burger: %s\n", burger);
    }
}