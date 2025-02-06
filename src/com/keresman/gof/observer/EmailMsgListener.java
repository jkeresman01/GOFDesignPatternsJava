package com.keresman.gof.observer;

public record EmailMsgListener(String email) implements Listener {
    @Override
    public void update(Event event) {
        System.out.printf("Sending mail to %s concerning: %s \n", email, event);
    }
}
