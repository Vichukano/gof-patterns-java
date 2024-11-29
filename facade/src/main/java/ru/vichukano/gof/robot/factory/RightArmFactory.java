package ru.vichukano.gof.robot.factory;

import ru.vichukano.gof.robot.parts.Arm;
import ru.vichukano.gof.robot.parts.RightArm;

public class RightArmFactory implements ArmFactory {
    @Override
    public Arm makeArm() {
        return new RightArm();
    }
}
