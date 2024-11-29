package ru.vichukano.gof;

public class DevOps implements WorkUnit {

    @Override
    public void doWork() {
        System.out.println("CI/CD.................Deploy!");
    }

}
