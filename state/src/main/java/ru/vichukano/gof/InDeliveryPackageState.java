package ru.vichukano.gof;

public final class InDeliveryPackageState implements  PackageState {
   private final Package aPackage;

    public InDeliveryPackageState(Package aPackage) {
        this.aPackage = aPackage;
    }

    @Override
    public void handle() {
        System.out.println("This package delivered!");
        aPackage.changeSate(new DeliveredPackageState());
    }

    @Override
    public boolean isFinal() {
        return false;
    }
}
