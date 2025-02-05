package com.keresman.gof.prototype;

public abstract class Vehicle{

    private String model;
    private String brand;
    private String color;

    protected Vehicle() {}

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Vehicle(Vehicle vehicle) {
        this.model = vehicle.model;
        this.brand = vehicle.brand;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();
}
