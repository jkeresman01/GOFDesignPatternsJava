package com.keresman.gof.iterator;

import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstSearchIterator<T> implements Iterator<T> {

    private final Vertex<T> startVertex;
    private final Deque<Vertex<T>> deque = new LinkedList<>();

    public DepthFirstSearchIterator(Vertex<T> startVertex) {
        this.startVertex = startVertex;
        this.deque.push(startVertex);
    }

    @Override
    public boolean hasNext() {
        return !deque.isEmpty();
    }

    @Override
    public Vertex<T> next() {
        if(!hasNext()) {
            return null;
        }

        Vertex<T> currentVertex = deque.pop();
        if(!currentVertex.isVisited()) {
            currentVertex.setVisited(true);
            currentVertex.getNeighbours().forEach(deque::push);
            return currentVertex;
        }

        return next();
    }

    @Override
    public void reset() {
        deque.clear();
        deque.push(startVertex);
    }
}
