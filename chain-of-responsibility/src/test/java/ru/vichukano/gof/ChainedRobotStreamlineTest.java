package ru.vichukano.gof;

import org.junit.jupiter.api.Test;
import ru.vichukano.gof.robot.Robocop;
import ru.vichukano.gof.robot.Robot;
import ru.vichukano.gof.robot.Terminator;

class ChainedRobotStreamlineTest {

    @Test
    void testChainOfResponsibility() {
        RobotStreamline equipmentStreamline = new ChainedRobotStreamline(
                new ArmorRobotStreamline(
                        new WeaponRobotStreamline(
                                new AmoRobotStreamline()
                        )
                )
        );
        Robot robocop = new Robocop();
        Robot t1000 = new Terminator();

        equipmentStreamline.equip(robocop);
        equipmentStreamline.equip(t1000);

        robocop.execute();
        t1000.execute();
    }

}