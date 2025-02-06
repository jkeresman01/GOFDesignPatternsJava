package com.keresman.gof.state;

public class Phone {

    private State state;

    public Phone() {
        this.state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        return "Locking the phone and turning off the screen!";
    }

    public String unlock() {
        return "Unlocking the phone to home screen!";
    }

    public String home() {
        return "Going ato home-screen!";
    }

    public String turnOff() {
        return "Turning off the screen!";
    }

    public String turnOn() {
        return "Turning on the screen!";
    }

    public String clickHome() {
        return state.onHome();
    }

    public String clickPower() {
        return state.onOffOn();
    }
}
