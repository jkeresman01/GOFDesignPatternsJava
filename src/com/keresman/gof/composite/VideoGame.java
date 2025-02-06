package com.keresman.gof.composite;

public class VideoGame extends Product{

    public VideoGame(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
