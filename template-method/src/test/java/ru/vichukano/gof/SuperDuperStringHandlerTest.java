package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

class SuperDuperStringHandlerTest {

    @Test
    void testTemplateMethodPattern() {
        BaseSomethingHandler<String> handler = new SuperDuperStringHandler();
        handler.handle("SOMETHING");
    }

}