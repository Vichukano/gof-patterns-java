package ru.vichukano.gof;

import java.util.HashMap;
import java.util.Map;

public class WeaponFactory {
    //flyweights store there
    private final Map<String, Weapon> weapons = new HashMap<>();

    public Weapon create(String type) {
        return weapons.computeIfAbsent(type, t -> switch (t) {
            case "melee" -> new Knife(t);
            case "range" -> new Minigun(t);
            case "heavy" -> new Bazuka(t);
            default -> null;
        });
    }

}
