package com.keresman.gof.facade;

public abstract class CryptoService {

    private DatabaseService databaseService;


    public abstract void buyCurrenscy(User user, double amount);
}
