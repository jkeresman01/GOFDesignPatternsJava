package com.keresman.gof.mediator;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();

        enterUserData(dialog);
        simulateUserInteraction(dialog);
    }

    private static void simulateUserInteraction(Dialog dialog) {
        dialog.simulateLoginClicked();
        dialog.simulateForgotPasswordClicked();
    }

    private static void enterUserData(Dialog dialog) {
        dialog.enterPassword("password");
        dialog.enterUsername("username");
    }
}
