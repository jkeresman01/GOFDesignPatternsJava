package com.keresman.gof.flyweight;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int BOOKS_TO_INSERT = 10_000;

    public static void main(String[] args) {
        Store store = new Store();
        insertBooks(store);
    }

    private static void insertBooks(Store store) {
        for (int i = 0; i < BOOKS_TO_INSERT / BookType.values().length; ++i) {
            store.storeBook(getRandomName(), getRandomPrice(), BookType.ACTION);
            store.storeBook(getRandomName(), getRandomPrice(), BookType.ROMANCE);
            store.storeBook(getRandomName(), getRandomPrice(), BookType.HISTORICAL);
            store.storeBook(getRandomName(), getRandomPrice(), BookType.FANTASY);
            store.storeBook(getRandomName(), getRandomPrice(), BookType.SCIENCE_FICTION);
            store.storeBook(getRandomName(), getRandomPrice(), BookType.CHILDREN);
            store.storeBook(getRandomName(), getRandomPrice(), BookType.MYSTERY);
            store.storeBook(getRandomName(), getRandomPrice(), BookType.POETRY);
        }
    }

    private static String getRandomName() {
        List<String> books = List.of("firstBook", "secondBook", "thirdBook");
        return books.get(new Random().nextInt(books.size()));
    }

    private static BigDecimal getRandomPrice() {
        return BigDecimal.valueOf(new Random().nextDouble(10, 200));
    }
}
