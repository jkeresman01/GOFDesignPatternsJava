package com.keresman.gof.factorymethod;

public class BeefBurger extends Burger {

    private final boolean isAngus;

    public BeefBurger(String addOns, boolean isAngus) {
        super(addOns);
        this.isAngus = isAngus;
    }

    @Override
    public String toString() {
        return "BeefBurger{" +
                "isAngus=" + isAngus +
                ", productID=" + productID +
                ", addOns='" + addOns + '\'' +
                '}';
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Beef Burger");
    }
}
