package ru.vichukano.gof.robot;

public class Pistol implements Weapon{
    @Override
    public void fire() {
        System.out.println("Bam-bam!!!");
    }
}
