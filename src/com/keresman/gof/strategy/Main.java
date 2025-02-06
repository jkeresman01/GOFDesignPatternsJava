package com.keresman.gof.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        examplePaymentByCreditCard(paymentService);
        examplePaymentByPayPal(paymentService);
    }

    private static void examplePaymentByPayPal(PaymentService paymentService) {
        paymentService.setPaymentStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);
    }

    private static void examplePaymentByCreditCard(PaymentService paymentService) {
        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);
    }
}
