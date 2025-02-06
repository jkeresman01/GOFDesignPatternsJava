package com.keresman.gof.prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(new Bus(), new Car());
        List<Vehicle> copies = vehicles.stream().map(Vehicle::clone).toList();
        copies.forEach(System.out::println);
    }
}