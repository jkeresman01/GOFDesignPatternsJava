package com.keresman.gof.command;

public class Room extends Component{

    private final Curtains curtains;

    public Room() {
        this.curtains = new Curtains();
    }

    public Curtains getCurtains() {
        return curtains;
    }

    public boolean areCurtainsOpen() {
        return curtains.areOpen();
    }
}
