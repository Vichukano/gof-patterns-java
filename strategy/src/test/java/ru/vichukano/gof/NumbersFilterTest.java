package ru.vichukano.gof;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersFilterTest {

    @Test
    void testStrategyPattern() {
        var filter = new NumbersFilter(new OnlyZeroFilterStrategy());
        Assertions.assertTrue(filter.isNumberPassed(10));
        Assertions.assertTrue(filter.isNumberPassed(-10));
        Assertions.assertFalse(filter.isNumberPassed(0));

        filter.changeStrategy(new PositiveFilterStrategy());
        Assertions.assertFalse(filter.isNumberPassed(10));
        Assertions.assertTrue(filter.isNumberPassed(-10));
        Assertions.assertTrue(filter.isNumberPassed(0));

        filter.changeStrategy(new NegativeFilterStrategy());
        Assertions.assertTrue(filter.isNumberPassed(10));
        Assertions.assertFalse(filter.isNumberPassed(-10));
        Assertions.assertTrue(filter.isNumberPassed(0));
    }

}