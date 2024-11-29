package ru.vichukano.gof;

public final class DeliveredPackageState implements PackageState {

    @Override
    public void handle() {
        System.out.println("Package delivered");
    }

    @Override
    public boolean isFinal() {
        return true;
    }

}
