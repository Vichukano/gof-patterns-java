package ru.vichukano.gof;

public final class PackageCreatedState implements PackageState {
    private final Package aPackage;

    public PackageCreatedState(Package aPackage) {
        this.aPackage = aPackage;
    }


    @Override
    public void handle() {
        System.out.println("Package moved to sorting center");
        aPackage.changeSate(new SortingPackageState(aPackage));
    }

    @Override
    public boolean isFinal() {
        return false;
    }

}
