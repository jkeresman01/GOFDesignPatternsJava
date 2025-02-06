package com.keresman.gof.composite;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        prepareOrder(deliveryService);
        System.out.println(deliveryService.calculateOrderPrice());
    }

    private static void prepareOrder(DeliveryService deliveryService) {
        VideoGame wow1 = new VideoGame("World of Warcraft", 100);
        VideoGame wow2 = new VideoGame("World of Warcraft", 100);
        VideoGame wow3 = new VideoGame("World of Warcraft", 100);

        VideoGame fifa = new VideoGame("FIFA", 100);

        Book firstBook = new Book("Clean architecture", 200);
        Book secondBook = new Book("Elements of reusable object oriented code", 400);

        CompositeBox firstCompositeBox = new CompositeBox(wow1);
        CompositeBox secondCompositeBox = new CompositeBox(firstBook, secondBook, wow2, wow3, fifa);

        deliveryService.setupOrder(firstCompositeBox, secondCompositeBox);
    }
}
