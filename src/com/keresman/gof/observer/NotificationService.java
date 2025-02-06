package com.keresman.gof.observer;

import java.lang.reflect.Array;
import java.util.*;

public class NotificationService {

    private final Map<Event, List<Listener>> observers;

    public NotificationService() {
        observers = new EnumMap<>(Event.class);
        Arrays.stream(Event.values()).forEach(e -> observers.put(e, new ArrayList<>()));
    }

    public void subscribe(Event event, Listener listener) {
        observers.get(event).add(listener);
    }

    public void unsubscribe(Event event, Listener listener) {
        observers.get(event).remove(listener);
    }

    public void notify(Event event) {
        observers.get(event).forEach(listener -> listener.update(event));
    }
}
