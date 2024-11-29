package ru.vichukano.gof.robot.factory;

import ru.vichukano.gof.robot.parts.Leg;
import ru.vichukano.gof.robot.parts.RightLeg;

public class RightLegFactory implements LegFactory{
    @Override
    public Leg makeLeg() {
        return new RightLeg();
    }
}
