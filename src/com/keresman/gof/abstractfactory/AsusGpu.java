package com.keresman.gof.abstractfactory;

public class AsusGpu implements Gpu{

    @Override
    public String toString() {
        return "Asus GPU";
    }

    @Override
    public void assemble() {
        System.out.println("Assemble AsusGpu");
    }
}
