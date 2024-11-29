package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

class CyborgFactoryFacadeTest {

    @Test
    void facadeExample() {
        var facade = new CyborgFactoryFacade();
        var cyborg = facade.makeCyborg();
        cyborg.activate();
    }

}