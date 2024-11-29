package ru.vichukano.gof;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CachedProxyRobotFactory implements RobotFactory {
    private final RobotFactory origin;
    private final List<Robot> cache = new ArrayList<>();
    private int cycles;

    public CachedProxyRobotFactory(RobotFactory origin, int cycles) {
        this.origin = origin;
        this.cycles = cycles;
    }

    @Override
    public Robot construct() {
        if (cycles != 0) {
            Robot robot = origin.construct();
            cache.add(robot);
            cycles--;
            return robot;
        }
        int idx = ThreadLocalRandom.current().nextInt(0, cache.size());
        return cache.get(idx);
    }
}
