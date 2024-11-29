package ru.vichukano.gof.macos;

import ru.vichukano.gof.Button;
import ru.vichukano.gof.CheckBox;
import ru.vichukano.gof.GUIFactory;

public class MacOsGuiFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
