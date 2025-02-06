package com.keresman.gof.command;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command{

    @Override
    public void execute() {
        curtains.openClose();
        System.out.println("Open/Close curtains command executed.");
    }
}
