package com.keresman.gof.facade;

public abstract class CryptoService {

    private DatabaseService databaseService;


    public abstract void buyCurrency(User user, double amount);
}
