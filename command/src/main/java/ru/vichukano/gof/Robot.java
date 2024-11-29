package ru.vichukano.gof;

public class Robot {

    public void turnOn() {
        System.out.println("Robot ON");
    }

    public void turnOff() {
        System.out.println("Robot OFF");
    }

    public void doWork(String workName) {
        System.out.println("Start to do: " + workName);
    }

    public void refuel(int count) {
        System.out.println("Start to refuel robot with " + count + " fuel");
    }

}
