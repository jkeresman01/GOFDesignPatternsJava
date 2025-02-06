package com.keresman.gof.command;

public record SwitchLightsCommand(Light light) implements Command {
    @Override
    public void execute() {
        light.switchLight();
        System.out.println("Switched Lights command is executed!");
    }
}
