package com.keresman.gof.templatemethod;

public class DiabloLoader extends GameLoader {
    @Override
    public byte[] loadLocalDate() {
        System.out.println("Loading Diablo files ...");
        // Some Diablo Code
        return new byte[0];
    }

    @Override
    public void createObjects() {
        System.out.println("Creating Diablo objects ...");
        // Some Diablo Code ...
    }

    @Override
    public void downloadAllAditionalFiles() {
        System.out.println("Downloading Diablo files ...");
        // Some Diablo Code ...
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading Diablo profiles ...");
        // Some Diablo Code ...
    }
}
