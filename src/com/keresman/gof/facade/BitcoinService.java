package com.keresman.gof.facade;

public class BitcoinService extends  CryptoService{
    @Override
    public void buyCurrency(User user, double amount) {
        System.out.printf("Buy currency [bitcoin] : %.2f%n", amount);
    }
}
