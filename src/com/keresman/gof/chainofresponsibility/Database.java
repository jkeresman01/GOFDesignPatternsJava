package com.keresman.gof.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private final Map<String, String> users;

    public Database() {
        users = new HashMap<>();
        users.put("admin_username", "admin_username");
        users.put("admin_password", "admin_password");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }

    public boolean isAdmin(String username) {
        return users.get(username).equals("admin_username");
    }
}