package com.keresman.gof.builder;

public class CarSchema {

    private final int id;
    private final String brand;
    private final String model;
    private final String color;

    CarSchema(int id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarSchema{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
