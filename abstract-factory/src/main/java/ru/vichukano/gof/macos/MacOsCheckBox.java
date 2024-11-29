package ru.vichukano.gof.macos;

import ru.vichukano.gof.CheckBox;

public class MacOsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Mac Os checkbox checked");
    }
}
