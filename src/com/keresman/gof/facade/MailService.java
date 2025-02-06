package com.keresman.gof.facade;

public class MailService {
    public void sendMail(User user) {
        System.out.println("Sending email to " + user.name());
    }
}
