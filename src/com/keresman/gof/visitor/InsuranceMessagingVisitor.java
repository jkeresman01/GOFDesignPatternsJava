package com.keresman.gof.visitor;

public class InsuranceMessagingVisitor implements Visitor {
    @Override
    public void sendEmail(Resident resident) {
        System.out.println("Sending mail about medical insurance ....");
    }

    @Override
    public void sendEmail(Bank resident) {
        System.out.println("Sending mail about theft insurance ....");
    }

    @Override
    public void sendEmail(Restaurant resident) {
        System.out.println("Sending mail about fire and food insurance ....");
    }
}
