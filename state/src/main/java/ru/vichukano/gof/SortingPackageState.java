package ru.vichukano.gof;

public final class SortingPackageState implements PackageState {
    private final Package aPackage;

    public SortingPackageState(Package aPackage) {
        this.aPackage = aPackage;
    }

    @Override
    public void handle() {
        System.out.println("Package successfully sorted and moved to delivery");
        aPackage.changeSate(new InDeliveryPackageState(aPackage));
    }

    @Override
    public boolean isFinal() {
        return false;
    }
}
