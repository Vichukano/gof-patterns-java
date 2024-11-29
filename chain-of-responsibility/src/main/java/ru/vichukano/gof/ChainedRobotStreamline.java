package ru.vichukano.gof;

import ru.vichukano.gof.robot.Robot;

/**
 * Start of chain of responsibility
 */
public class ChainedRobotStreamline implements RobotStreamline {
    private final RobotStreamline root;

    public ChainedRobotStreamline(RobotStreamline root) {
        this.root = root;
    }

    @Override
    public void equip(Robot robot) {
        root.equip(robot);
    }
}
