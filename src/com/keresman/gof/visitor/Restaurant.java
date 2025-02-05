package com.keresman.gof.visitor;

public class Restaurant extends Client{

    private final boolean isAvailableAbroad;

    protected Restaurant(String name, String address, int number, boolean isAvailableAbroad) {
        super(name, address, number);
        this.isAvailableAbroad = isAvailableAbroad;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "isAvailableAbroad=" + isAvailableAbroad +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.sendEmail(this);
    }
}
