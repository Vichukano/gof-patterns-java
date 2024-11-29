package ru.vichukano.gof.windows;

import ru.vichukano.gof.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }
}
