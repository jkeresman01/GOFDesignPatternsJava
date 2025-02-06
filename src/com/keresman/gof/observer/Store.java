package com.keresman.gof.observer;

import static com.keresman.gof.observer.Event.*;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notify(NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notify(SALE);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
