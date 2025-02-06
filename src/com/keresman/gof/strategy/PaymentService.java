package com.keresman.gof.strategy;

import java.math.BigDecimal;

public class PaymentService {

    private int cost;
    private boolean isDeliveryIncluded;

    private PaymentStrategy paymentStrategy;

    public void processOrder(int cost) {
        this.cost = cost;

        paymentStrategy.collectPaymentDetails();

        if(paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(new BigDecimal(cost));
        }
    }

    private int getTotalCost() {
        return isDeliveryIncluded ? cost + 10 : cost;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
