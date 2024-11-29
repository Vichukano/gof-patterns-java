package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

class GuiTest {

    @Test
    void testMementoPattern() {
        var textEditor = new TextEditor();
        var gui = new Gui(textEditor);
        textEditor.addText("Hello world\n");
        gui.save();
        textEditor.addText("I am memento pattern!\n");
        gui.save();
        textEditor.addText("Undo this line");
        gui.show();
        gui.undo();
        gui.show();
        gui.undo();
        gui.show();
    }

}