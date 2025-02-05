package com.keresman.gof.abstractfactory;

public class MsiMonitor implements Monitor {

    @Override
    public String toString() {
        return "MSI Monitor";
    }

    @Override
    public void assemble() {
        System.out.println("MsiMonitor assemble");
    }
}
