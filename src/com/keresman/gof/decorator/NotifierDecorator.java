package com.keresman.gof.decorator;

public class NotifierDecorator implements Notifier {

    private final Notifier wrapped;
    protected final DatabaseService databaseService;

    public NotifierDecorator(Notifier wrapped) {
        this.wrapped = wrapped;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
