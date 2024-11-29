package ru.vichukano.gof;

import java.util.concurrent.ThreadLocalRandom;

public class SlowRobotFactory implements RobotFactory {

    @Override
    public Robot construct() {
        String[] names = {"Terminator", "Robocop", "Cyborg", "Android"};
        int randIdx = ThreadLocalRandom.current().nextInt(0, 4);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        return new Robot(names[randIdx]);
    }

}
