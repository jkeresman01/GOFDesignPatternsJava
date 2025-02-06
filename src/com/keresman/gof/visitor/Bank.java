package com.keresman.gof.visitor;

public class Bank extends Client{

    protected Bank(String name, String address, int number) {
        super(name, address, number);
    }

    @Override
    public String toString() {
        return "Bank";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.sendEmail(this);
    }
}
