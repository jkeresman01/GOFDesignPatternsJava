package com.keresman.gof.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {

    private Map<String, Vehicle> cache = new HashMap<String, Vehicle>();

    public VehicleCache() {
        Vehicle buggati = new Car();
        Vehicle mercedes =  new Bus();

        cache.put("Buggati Chiron", buggati);
        cache.put("Mercedes Setra", mercedes);
    }

    public Vehicle get(String vehicle) {
        return cache.get(vehicle).clone();
    }
}
