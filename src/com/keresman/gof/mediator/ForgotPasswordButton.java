package com.keresman.gof.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPasswordButton extends JButton implements Component {

    private Mediator mediator;

    public ForgotPasswordButton() {
        super("Forgot Password");
    }

    @Override
    public void fireActionPerformed(ActionEvent forgotPassword) {
        mediator.forgetPassword();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Forgot Password";
    }
}
