package com.keresman.gof.builder;

public class CarDirector {

    public void constructBuggati(CarBuilder builder) {
        builder.withBrand("Buggati")
               .withModel("Verone")
               .withColor("Black");
    }

    public void constructLamborghini(CarBuilder builder) {
        builder.withBrand("Lamborghini")
               .withModel("Aventador")
               .withColor("Yellow");
    }
}
