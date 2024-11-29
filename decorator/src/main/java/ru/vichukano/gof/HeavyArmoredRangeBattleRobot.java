package ru.vichukano.gof;

public class HeavyArmoredRangeBattleRobot implements BattleRobot {
    private final BattleRobot origin;

    public HeavyArmoredRangeBattleRobot(BattleRobot origin) {
        this.origin = origin;
    }

    @Override
    public void executeWeapon() {
        System.out.println("Prepare armor...");
        this.origin.executeWeapon();
        System.out.println("Stand in defence stance!");
    }
}
