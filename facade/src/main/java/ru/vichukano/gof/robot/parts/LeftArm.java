package ru.vichukano.gof.robot.parts;

public class LeftArm implements Arm {
    @Override
    public void hold() {
        System.out.println("hold shield with left arm...");
    }
}
