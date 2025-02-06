package com.keresman.gof.proxy;

import java.util.List;

public class ProxyInternet implements Internet {

    private static final List<String> bannedSites = List.of(
            "https://www.google-banned1.com",
            "https://www.google-banned2.com"
    );

    private final Internet internet = new InternetImpl();

    @Override
    public void connect(String host) {
        boolean isSiteBanned = bannedSites.contains(host);

        if(isSiteBanned) {
            System.out.println("Access denied to " + host);
            return;
        }

        internet.connect(host);
    }
}
