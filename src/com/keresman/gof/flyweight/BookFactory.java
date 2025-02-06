package com.keresman.gof.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {

    private static final Map<String, BookType> books = new HashMap<>();

    public static BookType getInstance(String type) {
        if(!books.containsKey(type)) {
            books.put(type, BookType.valueOf(type));
        }

        return books.get(type);
    }
}
