package com.keresman.gof.facade;

public class Main {
    public static void main(String[] args) {
        CryptoFacade buyCrypto = new CryptoFacade();

        buyCrypto.buyCrypto(1000, "BTC");
        buyCrypto.buyCrypto(1_000_000, "ETH");
    }
}
