package ru.vichukano.gof.linux;

import ru.vichukano.gof.CheckBox;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Linux checkbox checked");
    }
}
