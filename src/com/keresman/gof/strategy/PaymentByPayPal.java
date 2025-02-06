package com.keresman.gof.strategy;

import java.math.BigDecimal;

public class PaymentByPayPal implements PaymentStrategy {

    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        email = "paypal@gmail.com";
        password = "paypal";

        System.out.println("Collecting PayPal account details ....");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.printf("Validating PayPal account details %s - %s ....", email, password);
        return true;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.printf("Paying %.2f amount to %s", amount.doubleValue(), email);
    }
}
