package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

import java.util.List;

class GUITest {

    @Test
    void testMediatorPatter() {
        Button delete = new DeleteButton();
        Button save = new SaveButton();
        Display display = new Display();
        TextBuffer tb = new TextBuffer();
        Mediator gui = new GUI(tb, display);
        delete.setMediator(gui);
        save.setMediator(gui);
        display.setMediator(gui);
        tb.setMediator(gui);

        display.addText(List.of("Text"));
        save.press();
        display.showText();
        tb.deleteText();
        display.showText();
        display.addText(List.of("Fizz buzz"));
        delete.press();
    }

}