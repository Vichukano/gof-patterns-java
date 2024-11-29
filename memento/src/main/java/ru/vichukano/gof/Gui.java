package ru.vichukano.gof;

import java.util.ArrayDeque;
import java.util.Deque;

public class Gui {
    private final Deque<TextEditor.TextEditorMemento> snapshots = new ArrayDeque<>();
    private final TextEditor textEditor;

    public Gui(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void show() {
        System.out.println(textEditor.getText());
    }

    public void save() {
        TextEditor.TextEditorMemento snapshot = textEditor.snapshot();
        snapshots.push(snapshot);
    }

    public void undo() {
        TextEditor.TextEditorMemento snapshot = snapshots.pop();
        textEditor.restore(snapshot);
    }
}
