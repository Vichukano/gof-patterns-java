package ru.vichukano.gof.robot.parts;

public class ArmoredBody implements Body {
    @Override
    public void move() {
        System.out.println("Move heavy armored body...");
    }
}
