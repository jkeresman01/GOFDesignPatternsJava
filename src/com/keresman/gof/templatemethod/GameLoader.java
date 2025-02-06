package com.keresman.gof.templatemethod;

public abstract class GameLoader {

    public void load() {
        byte[] data = loadLocalDate();
        createObjects();
        downloadAllAditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    public void cleanTempFiles() {
        System.out.println("Cleaning temp files ...");
        //Some common code
    }

    public abstract byte[] loadLocalDate();
    public abstract void createObjects();
    public abstract void downloadAllAditionalFiles();
    public abstract void initializeProfiles();
}
