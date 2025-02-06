package com.keresman.gof.observer;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();

        subscribe(store);
        notify(store);

        unsubscribe(store);
        notify(store);
    }

    private static void notify(Store store) {
        store.newItemPromotion();
        store.salePromotion();
    }

    private static void subscribe(Store store) {
        store.getNotificationService().subscribe(Event.NEW_ITEM, new EmailMsgListener("milicakrmpotic@gmail.com"));
        store.getNotificationService().subscribe(Event.SALE, new EmailMsgListener("milicakrmpotic2@gmail.com"));
        store.getNotificationService().subscribe(Event.NEW_ITEM, new EmailMsgListener("jk@gmail.com"));
        store.getNotificationService().subscribe(Event.NEW_ITEM, new MobileAppListener("milicakrmpotic@gmail.com"));
    }

    private static void unsubscribe(Store store) {
        store.getNotificationService().unsubscribe(Event.NEW_ITEM, new EmailMsgListener("jk@gmail.com"));
        store.getNotificationService().unsubscribe(Event.NEW_ITEM, new EmailMsgListener("milicakrmpotic@gmail.com"));
    }
}
