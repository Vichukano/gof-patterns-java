package ru.vichukano.gof.robot.parts;

public class RightArm implements Arm {
    @Override
    public void hold() {
        System.out.println("Hold weapon with right arm...");
    }
}
