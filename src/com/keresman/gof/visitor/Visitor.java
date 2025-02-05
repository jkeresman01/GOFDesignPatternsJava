package com.keresman.gof.visitor;

public interface Visitor {
    void sendEmail(Resident resident);
    void sendEmail(Bank resident);
    void sendEmail(Restaurant resident);
}
