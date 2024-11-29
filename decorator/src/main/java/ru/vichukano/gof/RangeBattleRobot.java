package ru.vichukano.gof;

public class RangeBattleRobot implements BattleRobot {
    private final BattleRobot origin;

    public RangeBattleRobot(BattleRobot origin) {
        this.origin = origin;
    }

    @Override
    public void executeWeapon() {
        this.origin.executeWeapon();
        System.out.println("Shoot with range weapon");
    }

}
