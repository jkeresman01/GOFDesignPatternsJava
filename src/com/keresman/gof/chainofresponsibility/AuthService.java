package com.keresman.gof.chainofresponsibility;

public class AuthService {

    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean authenticate(String username, String password) {
        boolean isAuthResultSuccess = handler.handle(username, password);
        System.out.printf("Auth result: %s\n", (isAuthResultSuccess ? "success" : "failure"));
        return isAuthResultSuccess;
    }
}
