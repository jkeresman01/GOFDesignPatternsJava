package com.keresman.gof.chainofresponsibility;

import javax.xml.crypto.Data;

public class UserExistsHandler extends Handler {

    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        boolean isValidUser = database.isValidUser(username);

        if(!isValidUser) {
            System.out.println("Username is not registered.");
            System.out.println("Sing up to our app now!");
            return false;
        }

        return handleNext(username, password);
    }
}
