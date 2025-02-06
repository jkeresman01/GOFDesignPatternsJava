package com.keresman.gof.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        paymentService.setPaymentStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);
    }
}
