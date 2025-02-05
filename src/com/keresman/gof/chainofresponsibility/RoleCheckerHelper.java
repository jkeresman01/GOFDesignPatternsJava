package com.keresman.gof.chainofresponsibility;

public class RoleCheckerHelper extends Handler {

    private Database database;

    public RoleCheckerHelper(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        boolean isAdmin = database.isAdmin(username);

        if(isAdmin) {
            System.out.printf("%s is admin\n", username);
            System.out.println("Loading admin page....");
            return true;
        }

        System.out.println("Loading user page....");
        return handleNext(username, password);
    }
}
