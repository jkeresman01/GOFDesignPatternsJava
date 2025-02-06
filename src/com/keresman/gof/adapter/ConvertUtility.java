package com.keresman.gof.adapter;

public class ConvertUtility {

    private ConvertUtility() {}

    public static JsonData convert(XMLData xmlData) {
        // Do some actual conversion
        return new JsonData();
    }

    public static XMLData convert(JsonData xmlData) {
        // Do some actual conversion
        return new XMLData();
    }
}
