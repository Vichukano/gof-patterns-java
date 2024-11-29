package ru.vichukano.gof.command;

import ru.vichukano.gof.Robot;

public class TurnOnCommand implements Command{
    private final Robot robot;

    public TurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
      robot.turnOn();
    }
}
