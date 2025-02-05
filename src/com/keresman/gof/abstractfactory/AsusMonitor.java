package com.keresman.gof.abstractfactory;

public class AsusMonitor implements Monitor {

    @Override
    public String toString() {
        return "Asus Monitor";
    }

    @Override
    public void assemble() {
        System.out.println("Assemble AsusMonitor");
    }
}
