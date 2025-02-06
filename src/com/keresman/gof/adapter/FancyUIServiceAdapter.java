package com.keresman.gof.adapter;

public class FancyUIServiceAdapter implements MultiRestoApp {

    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        this.fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenus(XMLData xmlData) {
        JsonData jsonData = ConvertUtility.convert(xmlData);
        System.out.println("Displaying Fancy menus using converted JSON data ....");
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XMLData xmlData) {
        JsonData jsonData = ConvertUtility.convert(xmlData);
        System.out.println("Displaying Fancy recommendations using converted JSON data ....");
        fancyUIService.displayRecommendations(jsonData);
    }
}
