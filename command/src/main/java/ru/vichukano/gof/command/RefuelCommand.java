package ru.vichukano.gof.command;

import ru.vichukano.gof.Robot;

public class RefuelCommand implements Command {
    private final Robot robot;
    private final int count;

    public RefuelCommand(Robot robot, int count) {
        this.robot = robot;
        this.count = count;
    }

    @Override
    public void execute() {
        robot.refuel(count);
    }
}
