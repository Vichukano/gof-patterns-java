package ru.vichukano.gof;

public class DecoratorPattern {

    void usageExample() {
        var extendedBattleRobot = new HeavyArmoredRangeBattleRobot(
                new RangeBattleRobot(
                        new BaseBattleRobot()
                )
        );
        extendedBattleRobot.executeWeapon();
    }

}
