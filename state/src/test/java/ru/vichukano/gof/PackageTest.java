package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

class PackageTest {

    @Test
    void testStatePatter() {
        var customerPackage = new Package();
        customerPackage.status();
        customerPackage.handle();
        customerPackage.status();
        customerPackage.handle();
        customerPackage.status();
        customerPackage.handle();
        customerPackage.status();
        customerPackage.handle();
        customerPackage.status();
    }

}