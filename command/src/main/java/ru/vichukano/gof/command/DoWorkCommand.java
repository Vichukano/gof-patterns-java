package ru.vichukano.gof.command;

import ru.vichukano.gof.Robot;

public class DoWorkCommand implements Command{
    private final Robot robot;
    private final String workName;

    public DoWorkCommand(Robot robot, String workName) {
        this.robot = robot;
        this.workName = workName;
    }

    @Override
    public void execute() {
       robot.doWork(workName);
    }
}
