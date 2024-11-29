package ru.vichukano.gof;

public class TerminatorFactory implements RobotFactory {

    @Override
    public Robot create() {
        return new Terminator();
    }

}
