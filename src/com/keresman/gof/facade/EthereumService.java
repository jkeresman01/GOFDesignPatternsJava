package com.keresman.gof.facade;

public class EthereumService extends CryptoService {
    @Override
    public void buyCurrency(User user, double amount) {
        System.out.printf("Buy currency [ether] : %.2f%n", amount);
    }
}
