package com.keresman.gof.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class LoginButton extends JButton implements Component {

    private Mediator mediator;

    public LoginButton() {
        super("Login");
    }

    @Override
    public void fireActionPerformed(ActionEvent login) {
        mediator.login();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
