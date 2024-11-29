package ru.vichukano.gof.command;

import ru.vichukano.gof.Robot;

public class TurnOffCommand implements Command {
    private final Robot robot;

    public TurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOff();
    }
}
