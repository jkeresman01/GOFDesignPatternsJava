package com.keresman.gof.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckerHelper(database));

        AuthService authService = new AuthService(handler);
        authService.authenticate("admin", "admin");
    }
}
