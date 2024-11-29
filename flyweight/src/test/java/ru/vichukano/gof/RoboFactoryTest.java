package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

class RoboFactoryTest {

    @Test
    void testCreateRobots() {
        var factory = new RoboFactory(new WeaponFactory());
        var meleeRobot = factory.construct("melee");
        var rangedRobot = factory.construct("range");
        rangedRobot.setAmo(100);
        var heavyRobot = factory.construct("heavy");
        heavyRobot.setAmo(5);
        meleeRobot.useWeapon();
        rangedRobot.useWeapon();
        heavyRobot.useWeapon();
    }

}