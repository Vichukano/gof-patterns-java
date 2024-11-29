package ru.vichukano.gof;

public class Knife implements Weapon{
    private final String type;

    public Knife(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("Use knife... " + type);
    }
}
