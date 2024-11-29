package ru.vichukano.gof;

public class Terminator implements Robot, Cloneable {
    private final Weapon weapon;

    public Terminator() {
        this.weapon = new Minigun();
    }

    @Override
    public void doWork() {
        System.out.println("Hasta la vista, baby!");
        this.weapon.fire();
    }

    @Override
    public Terminator clone() throws CloneNotSupportedException {
        return (Terminator) super.clone();
    }

    public static class Minigun implements Weapon, Cloneable {

        @Override
        public void fire() {
            System.out.println("Bam-bam-bam!!!");
        }

        @Override
        public Minigun clone() throws CloneNotSupportedException {
            return (Minigun) super.clone();
        }
    }

}
