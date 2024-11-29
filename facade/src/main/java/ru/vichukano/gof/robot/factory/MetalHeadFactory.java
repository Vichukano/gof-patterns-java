package ru.vichukano.gof.robot.factory;

import ru.vichukano.gof.robot.parts.Head;
import ru.vichukano.gof.robot.parts.MetalHead;

public class MetalHeadFactory implements HeadFactory {
    @Override
    public Head makeHead() {
        return new MetalHead();
    }
}
