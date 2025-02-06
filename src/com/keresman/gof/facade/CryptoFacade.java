package com.keresman.gof.facade;

public class CryptoFacade {

    private DatabaseService databaseService;
    private MailService mailService;
    private CryptoService cryptoService;

    public CryptoFacade() {
        this.databaseService = new DatabaseService();
        this.mailService = new MailService();
    }

    public void buyCrypto(double amount, String currency) {
        User user = databaseService.getUserById(UIService.getLoggedInUserId());

        boolean userHasSufficientBalance = user.balance().doubleValue() >= amount;

        if(!userHasSufficientBalance) {
            System.out.println("You do not have enough money to buy this crypto.");
            return;
        }

        cryptoService = CrypoServiceFactory.getInstance(currency);
        cryptoService.buyCurrency(user, amount);

        mailService.sendMail(user);

        System.out.printf("User %s have bought %.2f crypto.\n", user, amount);
    }
}
