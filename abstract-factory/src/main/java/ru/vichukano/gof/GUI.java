package ru.vichukano.gof;

import ru.vichukano.gof.linux.LinuxGUIFactory;
import ru.vichukano.gof.macos.MacOsGuiFactory;
import ru.vichukano.gof.windows.WindowsGUIFactory;

public class GUI {
    private final Button button;
    private final CheckBox checkbox;

    public GUI(String os) {
        var factory = factory(os);
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void use() {
        button.click();
        checkbox.check();
    }

    private GUIFactory factory(String os) {
        return switch (os) {
            case "linux" -> new LinuxGUIFactory();
            case "mac" -> new MacOsGuiFactory();
            case "windows" -> new WindowsGUIFactory();
            default -> throw new IllegalArgumentException("wrong os " + os);
        };
    }

}
