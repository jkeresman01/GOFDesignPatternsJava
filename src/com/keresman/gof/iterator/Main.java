package com.keresman.gof.iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vertex<Integer> vertex0 = new Vertex<>(0);
        Vertex<Integer> vertex1 = new Vertex<>(1);
        Vertex<Integer> vertex2 = new Vertex<>(2);
        Vertex<Integer> vertex3 = new Vertex<>(3);
        Vertex<Integer> vertex4 = new Vertex<>(4);
        Vertex<Integer> vertex5 = new Vertex<>(5);
        Vertex<Integer> vertex6 = new Vertex<>(6);

        vertex0.setNeighbours(List.of(vertex1, vertex5, vertex6));
        vertex1.setNeighbours(List.of(vertex3, vertex4, vertex5));
        vertex4.setNeighbours(List.of(vertex2, vertex6));
        vertex6.setNeighbours(List.of(vertex0));

        Iterator<Integer> it = new DepthFirstSearchIterator<>(vertex0);

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
