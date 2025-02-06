package com.keresman.gof.templatemethod;

public abstract class GameLoader {

    public void load() {
        byte[] data = loadLocalDate();
        createObjects(data);
        downloadAllAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    public void cleanTempFiles() {
        System.out.println("Cleaning temp files ...");
        //Some common code
    }

    public abstract byte[] loadLocalDate();
    public abstract void createObjects(byte[] data);
    public abstract void downloadAllAdditionalFiles();
    public abstract void initializeProfiles();
}
