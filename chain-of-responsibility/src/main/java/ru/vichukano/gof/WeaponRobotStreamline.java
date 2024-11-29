package ru.vichukano.gof;

import ru.vichukano.gof.robot.*;

public class WeaponRobotStreamline implements RobotStreamline {
    private final RobotStreamline next;

    public WeaponRobotStreamline(RobotStreamline next) {
        this.next = next;
    }

    @Override
    public void equip(Robot robot) {
        if (robot instanceof Robocop robocop) {
            robocop.equipWeapon(new Pistol());
        } else if (robot instanceof Terminator terminator) {
            terminator.equipWeapon(new Bazuka());
        }
        next.equip(robot);
    }
}
