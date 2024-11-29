package ru.vichukano.gof;

public class RoboFactory {
    private final WeaponFactory weaponFactory;

    public RoboFactory(WeaponFactory weaponFactory) {
        this.weaponFactory = weaponFactory;
    }

    public Robot construct(String type) {
        Weapon w = weaponFactory.create(type);
        return new Robot(w);
    }
}
