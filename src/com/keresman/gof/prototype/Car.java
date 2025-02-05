package com.keresman.gof.prototype;

public class Car extends Vehicle {

    private int speed;

    public Car() { }

    public Car(Car car) {
        super(car);
        this.speed = car.speed;
    }

    @Override
    public String toString() {
        return super.toString() + "speed=" + speed + '}';
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
