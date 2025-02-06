package com.keresman.gof.templatemethod;

public class WorldOfWarcraftLoader extends GameLoader {
    @Override
    public byte[] loadLocalDate() {
        System.out.println("Loading WoW files ...");
        // Some WoW Code
        return new byte[0];
    }

    @Override
    public void createObjects() {
        System.out.println("Creating WoW objects ...");
        // Some WoW Code ...
    }

    @Override
    public void downloadAllAditionalFiles() {
        System.out.println("Downloading WoW files ...");
        // Some WoW Code ...
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading WoW profiles ...");
        // Some WoW Code ...
    }
}
