package com.keresman.gof.visitor;

public class Bank extends Client{

    @Override
    public String toString() {
        return "Bank";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.sendEmail(this);
    }
}
