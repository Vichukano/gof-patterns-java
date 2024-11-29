package ru.vichukano.gof;

public class NumbersFilter {
    private FilterStrategy filterStrategy;

    public NumbersFilter(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    boolean isNumberPassed(int number) {
        return !this.filterStrategy.filter(number);
    }

    public void changeStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

}
