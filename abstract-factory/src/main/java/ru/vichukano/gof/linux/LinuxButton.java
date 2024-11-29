package ru.vichukano.gof.linux;

import ru.vichukano.gof.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Linux button clicked");
    }
}
