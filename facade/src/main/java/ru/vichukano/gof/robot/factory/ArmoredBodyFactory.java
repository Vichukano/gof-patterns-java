package ru.vichukano.gof.robot.factory;

import ru.vichukano.gof.robot.parts.ArmoredBody;
import ru.vichukano.gof.robot.parts.Body;

public class ArmoredBodyFactory implements BodyFactory{
    @Override
    public Body makeBody() {
        return new ArmoredBody();
    }
}
