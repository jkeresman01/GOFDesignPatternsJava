package com.keresman.gof.iterator;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {

    private final T data;

    private List<Vertex<T>> neighbours;
    private boolean isVisited;

    public Vertex(T data) {
        this.neighbours = new LinkedList<Vertex<T>>();
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "isVisited=" + isVisited +
                ", data=" + data +
                '}';
    }

    public List<Vertex<T>> getNeighbours() {
        return neighbours;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public Vertex<T> setNeighbours(List<Vertex<T>> neighbours) {
        this.neighbours = neighbours;
        return this;
    }

    public Vertex<T> setVisited(boolean visited) {
        isVisited = visited;
        return this;
    }
}
