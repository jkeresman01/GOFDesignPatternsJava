package com.keresman.gof.decorator;

public class Main {
    public static void main(String[] args) {
        exampleNotifyAll();
        exampleNotifyFBEmail();
    }

    private static void exampleNotifyFBEmail() {
        Notifier notifyFbEmail = new FacebookDecorator(new EmailNotifier("milica"));
        notifyFbEmail.send("This was so cool milica, second time");
    }

    private static void exampleNotifyAll() {
        Notifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new EmailNotifier("milica")));
        notifyAll.send("This was so cool milica");
    }
}
