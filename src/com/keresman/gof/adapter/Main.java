package com.keresman.gof.adapter;

public class Main {
    public static void main(String[] args) {
        XMLData xmlData = new XMLData();

        exampleOldUI(xmlData);
        exampleNewUI(xmlData);
    }

    private static void exampleNewUI(XMLData xmlData) {
        MultiRestoApp fancyMultiRestoApp = new FancyUIServiceAdapter();
        fancyMultiRestoApp.displayMenus(xmlData);
        fancyMultiRestoApp.displayRecommendations(xmlData);
    }

    private static void exampleOldUI(XMLData xmlData) {
        MultiRestoApp multiRestoApp = new MultiRestoAppImpl();
        multiRestoApp.displayMenus(xmlData);
        multiRestoApp.displayRecommendations(xmlData);
    }
}
