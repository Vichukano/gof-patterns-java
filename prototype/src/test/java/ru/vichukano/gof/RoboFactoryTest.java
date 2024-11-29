package ru.vichukano.gof;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoboFactoryTest {

    @Test
    void shouldProduceRobots() {
        var robocopFactory = new RobocopCloneFactory();
        var terminatorFactory = new TerminatorCloneFactory();

        Assertions.assertDoesNotThrow(() -> {
                    var robocop = robocopFactory.construct();
                    robocop.doWork();
                    var terminator = terminatorFactory.construct();
                    terminator.doWork();
                }
        );
    }

}