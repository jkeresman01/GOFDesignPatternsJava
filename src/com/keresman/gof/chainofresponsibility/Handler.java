package com.keresman.gof.chainofresponsibility;

public abstract class Handler {

    private Handler nextHandler;

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if(nextHandler == null) {
            return true;
        }

        return nextHandler.handle(username, password);
    }
}

