package com.keresman.gof.command;

public class Main {

    public static void main(String[] args) {
        curtainsExample();
        lightsExample();
    }

    private static void lightsExample() {
        FloorLamp floorLamp = new FloorLamp();
        floorLamp.setCommand(new SwitchLightsCommand(floorLamp.getLight()));
        floorLamp.executeCommand();
        System.out.println(floorLamp.getLight());
    }

    private static void curtainsExample() {
        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.getCurtains());
    }
}
