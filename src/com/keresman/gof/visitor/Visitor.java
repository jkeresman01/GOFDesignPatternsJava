package com.keresman.gof.visitor;

import javax.sound.midi.Receiver;

public interface Visitor {
    void sendEmail(Resident resident);
    void sendEmail(Bank resident);
    void sendEmail(Restaurant resident);
}
