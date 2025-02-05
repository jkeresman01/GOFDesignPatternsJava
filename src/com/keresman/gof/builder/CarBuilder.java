package com.keresman.gof.builder;

public interface CarBuilder {
    CarBuilder withId(int id);
    CarBuilder withBrand(String brand);
    CarBuilder withModel(String model);
    CarBuilder withColor(String color);
}
