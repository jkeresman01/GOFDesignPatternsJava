package com.keresman.gof.facade;

public class Main {

    public static void main(String[] args) {
        CryptoFacade buyCryptoFacade = new CryptoFacade();
        buyCryptoFacade.buyCrypto(1000, "BTC");
        buyCryptoFacade.buyCrypto(1_000_000, "ETH");
    }

}
