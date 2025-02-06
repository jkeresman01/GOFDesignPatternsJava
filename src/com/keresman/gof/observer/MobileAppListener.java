package com.keresman.gof.observer;

public record MobileAppListener(String username) implements Listener {
    @Override
    public void update(Event event) {
        System.out.printf("Sending mobile app notification to %s concerning %s\n", username, event);
    }
}
