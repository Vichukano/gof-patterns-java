package ru.vichukano.gof;

public sealed interface PackageState permits
        DeliveredPackageState,
        InDeliveryPackageState,
        PackageCreatedState,
        SortingPackageState {

    void handle();

    boolean isFinal();
}
