package com.keresman.gof.decorator;

public class FacebookDecorator extends NotifierDecorator{

    public FacebookDecorator(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String username = getUsername();
        String fbName = databaseService.getFBNameFromUsername(username);
        System.out.printf("Sending %s on Facebook to %s\n", message, fbName);
    }
}
