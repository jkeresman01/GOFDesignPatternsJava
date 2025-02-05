package com.keresman.gof.abstractfactory;

public abstract class Burger {

    private static int idGenerator;

    protected Integer productID;
    protected String addOns;

    public Burger(String addOns) {
        this.productID = ++idGenerator;
        this.addOns = addOns;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "productID=" + productID +
                ", addOns='" + addOns + '\'' +
                '}';
    }

    public abstract void prepare();
}
