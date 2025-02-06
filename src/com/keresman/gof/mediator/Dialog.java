package com.keresman.gof.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Dialog implements Mediator {

    private final JTextField userTextBox = new JTextField();
    private final JPasswordField passwordTextBox = new JPasswordField();
    private final LoginButton loginButton = new LoginButton();
    private final ForgotPasswordButton passwordButton = new ForgotPasswordButton();

    public Dialog() {
        loginButton.setMediator(this);
        passwordButton.setMediator(this);
    }

    @Override
    public void login() {
        String user = userTextBox.getText();
        String password = new String(passwordTextBox.getPassword());

        System.out.println("Logged in as: " + user);

        // Code to validate username && password
    }

    @Override
    public void forgetPassword() {
        String user = userTextBox.getText();
        System.out.println("Generating new password for: " + user);
    }

    public void enterUsername(String username) {
        userTextBox.setText(username);
    }

    public void enterPassword(String password) {
        passwordTextBox.setText(password);
    }

    public void simulateLoginClicked() {
        loginButton.fireActionPerformed(new ActionEvent(this, 0, "login"));
    }

    public void simulateForgotPasswordClicked() {
        passwordButton.fireActionPerformed(new ActionEvent(this, 0, "forgot password"));
    }
}
