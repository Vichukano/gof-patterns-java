package ru.vichukano.gof;

import java.util.ArrayList;
import java.util.List;

public class Display {
    private final List<String> displayText = new ArrayList<>();
    private Mediator mediator;

    public void showText() {
        mediator.printTextOnDisplay();
    }

    public void addText(List<String> text){
        displayText.addAll(text);
    }

    public void refreshDisplay() {
        displayText.clear();
        System.out.println("Display refreshed");
    }

    public List<String> getDisplayText() {
        return displayText;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
