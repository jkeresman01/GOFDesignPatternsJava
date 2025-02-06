package com.keresman.gof.command;

public class Curtains {

    private boolean areOpen;

    @Override
    public String toString() {
        return "Curtains{" +
                "areOpen=" + areOpen +
                '}';
    }

    public void openClose() {
        areOpen = !areOpen;
    }

    public boolean areOpen() {
        return areOpen;
    }
}
