package ru.vichukano.gof;

public class RobocopFactory implements RobotFactory{

    @Override
    public Robot create() {
        return new Robocop();
    }

}
