package com.keresman.gof.bridge;

public class Main {
    public static void main(String[] args) {
        exampleAmericanRestaurant();
        exampleItalianRestaurant();
    }

    private static void exampleItalianRestaurant() {
        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }

    private static void exampleAmericanRestaurant() {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();
    }
}
