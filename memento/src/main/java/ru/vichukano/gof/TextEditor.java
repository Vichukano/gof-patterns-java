package ru.vichukano.gof;

public class TextEditor {
    private final StringBuilder text = new StringBuilder();

    public void addText(String text) {
        this.text.append(text);
    }

    public void delete() {
        if (!this.text.isEmpty()) {
            this.text.delete(this.text.length() - 1, this.text.length());
        }
    }

    public String getText() {
        return this.text.toString();
    }

    /**
     * Этот объект представляет снимок состояния TextEditor.
     * Должен быть неизменяемым.
     *
     * @return
     */
    public final TextEditorMemento snapshot() {
        return new TextEditorMemento(text.toString());
    }

    public void restore(TextEditorMemento memento) {
        this.text.delete(0, text.length());
        this.text.append(memento.text);
    }

    public static class TextEditorMemento {
        private final String text;

        private TextEditorMemento(String text) {
            this.text = text;
        }
    }

}
