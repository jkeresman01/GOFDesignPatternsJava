package com.keresman.gof.flyweight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, BigDecimal price, BookType type) {
        BookType bookType = BookFactory.getInstance(type.toString());
        books.add(new Book(name, price, bookType));
    }

    public void displayAllBooks() {
        books.forEach(System.out::println);
    }
}
