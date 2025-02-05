package com.keresman.gof.prototype;

public class Bus extends Vehicle {

    private int doorsCount;

    public Bus() {}

    public Bus(Bus bus) {
        super(bus);
        this.doorsCount = bus.doorsCount;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + "doorsCount=" + doorsCount + '}';
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
