package com.keresman.gof.facade;

public class CryptoFacade {

    public void buyCrypto(double amount, String currency) {
        DatabaseService dbService = new DatabaseService();
        User user = dbService.getUserById(UIService.getLoggedInUserId());

        boolean userHasSufficientBalance = user.balance().doubleValue() >= amount;

        if(!userHasSufficientBalance) {
            System.out.println("You do not have enough money to buy this crypto.");
            return;
        }

        CryptoService cryptoService = CrypoServiceFactory.getInstance(currency);
        cryptoService.buyCurrenscy(user, amount);

        MailService mailService = new MailService();
        mailService.sendMail(user);

        System.out.printf("User %s have bought %.2f crypto.\n", user, amount);
    }
}
