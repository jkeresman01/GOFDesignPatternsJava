package com.keresman.gof.visitor;

public abstract class Client {

    private final String name;
    private final String address;
    private final int number;

    protected Client(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public abstract void accept(Visitor visitor);
}
