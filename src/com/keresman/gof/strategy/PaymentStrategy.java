package com.keresman.gof.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(BigDecimal amount);
}
