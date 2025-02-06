package com.keresman.gof.templatemethod;

public class DiabloLoader extends GameLoader {
    @Override
    public byte[] loadLocalDate() {
        System.out.println("Loading Diablo files ...");
        // Some Diablo Code
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating Diablo objects ...");
        // Some Diablo Code ...
    }

    @Override
    public void downloadAllAdditionalFiles() {
        System.out.println("Downloading Diablo files ...");
        // Some Diablo Code ...
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading Diablo profiles ...");
        // Some Diablo Code ...
    }
}
