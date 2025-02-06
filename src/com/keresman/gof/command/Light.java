package com.keresman.gof.command;

public class Light {

    private boolean isSwitchedOn;

    @Override
    public String toString() {
        return "Light{" +
                "isSwitchedOn=" + isSwitchedOn +
                '}';
    }

    public void switchLight() {
        isSwitchedOn = !isSwitchedOn;
    }

    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }
}
