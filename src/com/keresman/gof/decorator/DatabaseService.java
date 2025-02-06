package com.keresman.gof.decorator;

public class DatabaseService {

    public String getEmailForUsername(String username) {
        return username + "@Mail";
    }

    public String getPhoneNoFromUsername(String username) {
        return username + "@Phone";
    }

    public String getFBNameFromUsername(String username) {
        return username + "@FB";
    }
}
