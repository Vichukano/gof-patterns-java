package ru.vichukano.gof;

public class NegativeFilterStrategy implements FilterStrategy {
    @Override
    public boolean filter(int num) {
        return num < 0;
    }
}
