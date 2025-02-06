package com.keresman.gof.flyweight;

import java.math.BigDecimal;

public class Book {

    private final String name;
    private final BigDecimal price;
    private final BookType type;

    public Book(String name, BigDecimal price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BookType getType() {
        return type;
    }
}
