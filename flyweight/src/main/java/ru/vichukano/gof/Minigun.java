package ru.vichukano.gof;

public class Minigun implements Weapon{
    private final String type;

    public Minigun(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("Use minigun... " + type);
    }
}
