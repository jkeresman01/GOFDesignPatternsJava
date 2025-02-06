package com.keresman.gof.iterator;

public interface Iterator<T> {
    boolean hasNext();
    Vertex<T> next();
    void reset();
}
