package ru.vichukano.gof;

import java.util.ArrayList;
import java.util.List;

public class TextBuffer {
    private Mediator mediator;
    private final List<String> text = new ArrayList<>();

    public void addText(List<String> text) {
        this.text.addAll(text);
    }

    public void deleteText() {
        this.text.clear();
        mediator.refresh();
    }

    public List<String> getText() {
        return text;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}
