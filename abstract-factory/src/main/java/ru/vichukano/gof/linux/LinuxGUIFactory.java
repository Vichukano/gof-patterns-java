package ru.vichukano.gof.linux;

import ru.vichukano.gof.Button;
import ru.vichukano.gof.CheckBox;
import ru.vichukano.gof.GUIFactory;

public class LinuxGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
