package ru.vichukano.gof;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RobotFactoryTest {

    @Test
    void shouldCreateDifferentRobots() {
        var robocopFactory = new RobocopFactory();
        var terminatorFactory = new TerminatorFactory();

        var robocop = robocopFactory.create();
        var terminator = terminatorFactory.create();
        robocop.doWork();
        terminator.doWork();

        Assertions.assertInstanceOf(Robocop.class, robocop);
        Assertions.assertInstanceOf(Terminator.class, terminator);
    }

}