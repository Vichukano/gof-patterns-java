package ru.vichukano.gof.robot;

public interface Robot {

    void equipArmor(Armor armor);

    void equipWeapon(Weapon weapon);

    void equipAmmo(Integer amo);

    void execute();

}
