package ru.vichukano.gof.robot.factory;

import ru.vichukano.gof.robot.parts.Arm;
import ru.vichukano.gof.robot.parts.LeftArm;

public class LeftArmFactory implements ArmFactory {
    @Override
    public Arm makeArm() {
        return new LeftArm();
    }
}
