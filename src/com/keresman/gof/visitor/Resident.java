package com.keresman.gof.visitor;

public class Resident extends Client{

    private final String inssuranceClass;

    protected Resident(String name, String address, int number, String inssuranceClass) {
        super(name, address, number);
        this.inssuranceClass = inssuranceClass;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "inssuranceClass='" + inssuranceClass + '\'' +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.sendEmail(this);
    }
}
