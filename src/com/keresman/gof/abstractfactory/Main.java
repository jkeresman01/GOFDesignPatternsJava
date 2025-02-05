package com.keresman.gof.abstractfactory;

public class Main {
    public static void main(String[] args) {
        msiExample();
        asusExample();
    }

    private static void msiExample() {
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        System.out.println(msiGpu);
        System.out.println(msiMonitor);
    }

    private static void asusExample() {
        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();

        System.out.println(asusGpu);
        System.out.println(asusMonitor);
    }
}