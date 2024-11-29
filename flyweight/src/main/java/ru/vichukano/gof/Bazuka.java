package ru.vichukano.gof;

public class Bazuka implements Weapon{
    private final String type;

    public Bazuka(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("Use BAZUKA... " + type);

    }
}
