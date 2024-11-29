package ru.vichukano.gof;

public class PositiveFilterStrategy implements FilterStrategy {
    @Override
    public boolean filter(int num) {
        return num > 0;
    }
}
