package ru.vichukano.gof.macos;

import ru.vichukano.gof.Button;

public class MacOsButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Os clicked");
    }
}
