package com.keresman.gof.decorator;

public class EmailNotifier implements Notifier {

    private final String username;
    private final DatabaseService databaseService;

    public EmailNotifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        String email = databaseService.getEmailForUsername(username);
        System.out.printf("Sending %s via email to %s\n", message, email);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
