package ru.vichukano.gof;

/**
 * Контекст, состояние которого будет меняться.
 */
public class Package {
    private PackageState state;

    public Package() {
        this.state = new PackageCreatedState(this);
    }

    public void handle() {
        this.state.handle();
    }

    void changeSate(PackageState state) {
        if (this.state.isFinal()) {
            System.out.println("state of delivered package can not changed");
        } else {
            this.state = state;
        }
    }

    public void status() {
        switch (state) {
            case PackageCreatedState createdState -> System.out.println("Created");
            case DeliveredPackageState deliveredPackageState -> System.out.println("Delivered");
            case InDeliveryPackageState inDeliveryPackageState -> System.out.println("In Delivery");
            case SortingPackageState sortingPackageState -> System.out.println("Sorting");
        }
    }

}
