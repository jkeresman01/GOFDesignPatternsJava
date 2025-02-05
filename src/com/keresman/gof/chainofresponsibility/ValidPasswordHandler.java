package com.keresman.gof.chainofresponsibility;

public class ValidPasswordHandler extends Handler {

    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        boolean isValidPassword = database.isValidPassword(username, password);

        if (!isValidPassword) {
            System.out.println("Invalid password");
            return false;
        }

        return handleNext(username, password);
    }
}
