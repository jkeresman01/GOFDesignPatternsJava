package com.keresman.gof.builder;

public class CarSchemaBuilder implements CarBuilder {

    private int id;
    private String brand;
    private String model;
    private String color;

    @Override
    public CarBuilder withId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public CarSchema build() {
        return new CarSchema(id, brand, model, color);
    }
}
