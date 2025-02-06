package com.keresman.gof.memento;

import com.keresman.gof.memento.TextArea.Memento;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {

    private final TextArea textArea;
    private final Deque<Memento> stateHistory;

    public Editor() {
        this.textArea = new TextArea();
        this.stateHistory = new LinkedList<>();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.offer(textArea.takeSnapshot());
    }

    public void undo() {
        if(stateHistory.isEmpty()) {
            return;
        }

        stateHistory.pollLast();
        textArea.restore(stateHistory.peekLast());
    }

    public void printText() {
        System.out.println(textArea.getText());
    }
}
