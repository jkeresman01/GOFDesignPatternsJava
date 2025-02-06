package com.keresman.gof.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        writeSomeText(editor);
        undoWrittenText(editor);
    }

    private static void writeSomeText(Editor editor) {
        editor.write("Milica Krmpotic");
        editor.printText();

        editor.write("Cool Cool Cool");
        editor.printText();

        editor.write("Pikachusss");
        editor.printText();
    }
    private static void undoWrittenText(Editor editor) {
        editor.undo();
        editor.printText();

        editor.undo();
        editor.printText();

        editor.undo();
        editor.printText();
    }
}
