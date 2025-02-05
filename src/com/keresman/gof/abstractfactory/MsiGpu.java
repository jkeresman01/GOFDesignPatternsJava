package com.keresman.gof.abstractfactory;

public class MsiGpu implements Gpu{

    @Override
    public String toString() {
        return "Msi Gpu";
    }

    @Override
    public void assemble() {
        System.out.println("MsiGpu assembled");
    }
}
