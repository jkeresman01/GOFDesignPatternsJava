package com.keresman.gof.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {

    private final List<Box> children;

    public CompositeBox(Box... children) {
        this.children = new ArrayList<>();
        this.children.addAll(Arrays.asList(children));
    }

    @Override
    public double calculatePrice() {
        return children.stream()
                .mapToDouble(Box::calculatePrice)
                .sum();
    }
}
