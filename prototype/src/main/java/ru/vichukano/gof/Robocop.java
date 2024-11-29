package ru.vichukano.gof;

public class Robocop implements Robot {
    private final Weapon weapon;

    public Robocop() {
        this.weapon = new Gun();
    }

    public Robocop(Robocop other) {
        this.weapon = other.weapon;
    }

    @Override
    public void doWork() {
        System.out.println("You are under arrest!");
        this.weapon.fire();
    }

    public static class Gun implements Weapon {
        @Override
        public void fire() {
            System.out.println("Bum-bum!");
        }
    }

}
