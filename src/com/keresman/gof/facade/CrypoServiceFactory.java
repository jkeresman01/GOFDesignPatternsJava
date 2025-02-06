package com.keresman.gof.facade;

public class CrypoServiceFactory {

    public static CryptoService getInstance(String currency) {
        if(currency.equals("BTN")) {
            return new BitcoinService();
        }

        if(currency.equals("ETH")) {
            return new EthereumService();
        }

        return new BitcoinService();
    }
}
