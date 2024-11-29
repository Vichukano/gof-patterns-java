package ru.vichukano.gof.robot.parts;

public class RightLeg implements Leg{
    @Override
    public void walk() {
        System.out.println("Walk with right leg...");
    }
}
