package ru.vichukano.gof.robot;

public class Terminator implements Robot {
    private Armor armor;
    private Weapon weapon;
    private Integer amo;

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipAmmo(Integer amo) {
        this.amo = amo;
    }

    @Override
    public void execute() {
        System.out.println("Terminator start to shoot!");
        for (int i = 0; i < amo; i++) {
            weapon.fire();
        }
        armor.protect();
    }
}
