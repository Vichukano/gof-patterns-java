package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgePatternTest {

    @Test
    void testBridge() {
        var pattern = new BridgePattern();
        pattern.bridge();
    }

}