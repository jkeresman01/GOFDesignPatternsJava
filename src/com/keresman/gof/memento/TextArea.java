package com.keresman.gof.memento;

public class TextArea {

    private String text;

    public Memento takeSnapshot() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento != null ? memento.getSavedText() : null;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static class Memento {

        private final String text;

        public Memento(String text) {
            this.text = text;
        }

        private String getSavedText() {
            return text;
        }
    }
}
