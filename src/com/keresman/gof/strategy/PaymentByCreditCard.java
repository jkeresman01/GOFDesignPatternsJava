package com.keresman.gof.strategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentByCreditCard implements PaymentStrategy {

    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {
        creditCard = new CreditCard(
                1L,
                new BigDecimal("100000.9"),
               "000-123412-1243124" ,
                LocalDateTime.now(),
                "123"
        );

        System.out.println("Collecting credit card details ....");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating credit card details ....");
        return true;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Payment by credit card ....");
    }
}
