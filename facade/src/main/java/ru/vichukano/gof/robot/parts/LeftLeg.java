package ru.vichukano.gof.robot.parts;

public class LeftLeg implements Leg {
    @Override
    public void walk() {
        System.out.println("Walk with left leg...");
    }
}
