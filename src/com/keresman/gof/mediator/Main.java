package com.keresman.gof.mediator;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();

        dialog.enterPassword("password");
        dialog.enterUsername("username");

        dialog.simulateLoginClicked();
        dialog.simulateForgotPasswordClicked();
    }
}
