package ru.vichukano.gof;

import ru.vichukano.gof.robot.Terminator;
import ru.vichukano.gof.robot.*;

public class ArmorRobotStreamline implements RobotStreamline {
    private final RobotStreamline next;

    public ArmorRobotStreamline(RobotStreamline next) {
        this.next = next;
    }

    @Override
    public void equip(Robot robot) {
        System.out.println("Start to equip robot");
        if (robot instanceof Robocop robocop) {
            robocop.equipArmor(new PlateArmor());
        } else if (robot instanceof Terminator terminator) {
            terminator.equipArmor(new CarbonArmor());
        } else {
            System.out.println("Can't equip this robot");
        }
        next.equip(robot);
    }
}
