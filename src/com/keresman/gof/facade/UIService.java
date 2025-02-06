package com.keresman.gof.facade;

public class UIService {

    public static long getLoggedInUserId() {
        return 1L;
    }

    public void logIn(String username, String password) {
        System.out.println("Logged in as " + username);
    }

    public void logOut(String username, String password) {
        System.out.println("Logging out ");
    }
}
