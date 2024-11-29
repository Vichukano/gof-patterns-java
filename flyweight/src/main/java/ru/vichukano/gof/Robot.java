package ru.vichukano.gof;

/**
 * This is complex object with internal(weapon) and external state(amo).
 */
public class Robot {
    private final Weapon weapon;
    private int amo;

    public Robot(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAmo() {
        return amo;
    }

    public void setAmo(int amo) {
        this.amo = amo;
    }

    public void useWeapon() {
        System.out.println("Battle robot use his weapon!");
        weapon.use();
    }
}
