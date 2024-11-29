package ru.vichukano.gof;

import ru.vichukano.gof.robot.Robocop;
import ru.vichukano.gof.robot.Robot;
import ru.vichukano.gof.robot.Terminator;

public class AmoRobotStreamline implements RobotStreamline {
    @Override
    public void equip(Robot robot) {
        if (robot instanceof Robocop robocop) {
            robocop.equipAmmo(10);
        } else if (robot instanceof Terminator terminator) {
            terminator.equipAmmo(2);
        } else {
            System.out.println("Can't equip this robot");
        }
        System.out.println("Finish to equip robot");
    }
}
