package com.keresman.gof.state;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        simulatePhoneClicks(phone);
    }

    private static void simulatePhoneClicks(Phone phone) {
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());

        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());

        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());

        System.out.println(phone.clickHome());
    }
}
