package ru.vichukano.gof.windows;

import ru.vichukano.gof.Button;
import ru.vichukano.gof.CheckBox;
import ru.vichukano.gof.GUIFactory;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
