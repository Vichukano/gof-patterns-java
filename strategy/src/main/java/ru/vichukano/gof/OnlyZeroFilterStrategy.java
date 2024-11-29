package ru.vichukano.gof;

public class OnlyZeroFilterStrategy implements FilterStrategy {
    @Override
    public boolean filter(int num) {
        return num == 0;
    }
}
