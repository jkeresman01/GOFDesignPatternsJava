package com.keresman.gof.templatemethod;

public class Main {

    public static void main(String[] args) {
        diabloExample();
        wowExample();
    }

    private static void wowExample() {
        GameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();
    }

    private static void diabloExample() {
        GameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();
    }

}
