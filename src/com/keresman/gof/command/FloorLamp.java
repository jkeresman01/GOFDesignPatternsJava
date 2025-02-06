package com.keresman.gof.command;

public class FloorLamp extends Component{

    private final Light light;

    public FloorLamp() {
        this.light = new Light();
    }

    @Override
    public String toString() {
        return "FloorLamp{" +
                "light=" + light +
                '}';
    }

    public Light getLight() {
        return light;
    }

    public boolean isLightOn() {
        return light.isSwitchedOn();
    }
}
