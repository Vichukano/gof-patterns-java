package ru.vichukano.gof.robot.factory;

import ru.vichukano.gof.robot.parts.LeftLeg;
import ru.vichukano.gof.robot.parts.Leg;

public class LeftLegFactory implements LegFactory{
    @Override
    public Leg makeLeg() {
        return new LeftLeg();
    }
}
