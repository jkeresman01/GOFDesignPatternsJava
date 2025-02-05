package com.keresman.gof.factorymethod;

public class ChickenBurger extends Burger {

    private final boolean isCombo;

    public ChickenBurger(String addOns, boolean isCombo) {
        super(addOns);
        this.isCombo = isCombo;
    }

    @Override
    public String toString() {
        return "ChickenBurger{" +
                "isCombo=" + isCombo +
                ", productID=" + productID +
                ", addOns='" + addOns + '\'' +
                '}';
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Burger");
    }
}
