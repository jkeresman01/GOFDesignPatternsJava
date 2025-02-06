package com.keresman.gof.proxy;

public class InternetImpl implements Internet {
    @Override
    public void connect(String host) {
        System.out.println("Successfully opened connection to " + host);
    }
}
