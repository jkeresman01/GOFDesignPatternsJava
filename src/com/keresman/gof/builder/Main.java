package com.keresman.gof.builder;

public class Main {

    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        CarBuilderImpl carBuilder = new CarBuilderImpl();

        exampleBuggati(carDirector, carBuilder);
        exampleLamborghini(carDirector, carBuilder);
    }

    private static void exampleLamborghini(CarDirector carDirector, CarBuilderImpl carBuilder) {
        carDirector.constructLamborghini(carBuilder);
        Car lamborghini = carBuilder.build();
        System.out.println(lamborghini);
    }

    private static void exampleBuggati(CarDirector carDirector, CarBuilderImpl carBuilder) {
        carDirector.constructBuggati(carBuilder);
        Car buggati = carBuilder.build();
        System.out.println(buggati);
    }
}
