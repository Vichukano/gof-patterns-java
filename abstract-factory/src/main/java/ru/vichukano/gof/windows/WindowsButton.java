package ru.vichukano.gof.windows;

import ru.vichukano.gof.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}
