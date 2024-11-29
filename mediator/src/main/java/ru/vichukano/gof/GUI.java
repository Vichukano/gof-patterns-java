package ru.vichukano.gof;

/**
 * Все взаимодейсвтия объектов происходят через медиатор, объекты не взаимодействуют между собой напрямую.
 */
public class GUI implements Mediator {
    private final TextBuffer textBuffer;
    private final Display display;

    public GUI(TextBuffer textBuffer, Display display) {
        this.textBuffer = textBuffer;
        this.display = display;
    }

    @Override
    public void printTextOnDisplay() {
        var displayText = String.join("", display.getDisplayText());
        var bufferText = String.join("", textBuffer.getText());
        System.out.println(displayText + bufferText);
    }

    @Override
    public void saveText() {
        var text = display.getDisplayText();
        textBuffer.addText(text);
    }

    @Override
    public void deleteText() {
        textBuffer.deleteText();
    }

    @Override
    public void refresh() {
        display.refreshDisplay();
    }

}
