package ru.vichukano.gof.robot.parts;

public class MetalHead implements Head{
    @Override
    public void think() {
        System.out.println("Activate processor in metal head...");
    }
}
