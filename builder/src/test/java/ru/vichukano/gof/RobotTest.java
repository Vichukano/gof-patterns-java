package ru.vichukano.gof;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void testRobotBuilder() {
        var robocop = Robot.builder()
                .name("Robocop")
                .serialNumber(100500)
                .type(Robot.Type.CYBORG)
                .friendly(true)
                .build();

        Assertions.assertEquals(robocop.getName(), "Robocop");
        Assertions.assertEquals(robocop.getSerialNumber(), 100500);
        Assertions.assertEquals(robocop.getType(), Robot.Type.CYBORG);
        assertTrue(robocop.isFriendly());
    }

}