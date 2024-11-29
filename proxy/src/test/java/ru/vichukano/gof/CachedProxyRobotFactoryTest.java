package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class CachedProxyRobotFactoryTest {

    @Test
    void testCachedProxy() {
        RobotFactory factory = new CachedProxyRobotFactory(new SlowRobotFactory(), 3);
        IntStream.rangeClosed(0, 50).forEach(i ->
                System.out.println("Constructed robot: " + factory.construct())
        );
    }

}