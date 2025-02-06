package com.keresman.gof.decorator;

public class WhatsAppDecorator extends NotifierDecorator{

    public WhatsAppDecorator(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String username = getUsername();
        String phoneNo = databaseService.getPhoneNoFromUsername(username);
        System.out.printf("Sending %s on WhatsUp to %s\n", message, phoneNo);
    }
}
