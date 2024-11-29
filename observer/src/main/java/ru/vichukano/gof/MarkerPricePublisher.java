package ru.vichukano.gof;

import java.util.ArrayList;
import java.util.List;

public class MarkerPricePublisher implements PricePublisher {
    private final List<PriceListener> listeners = new ArrayList<>();

    @Override
    public void addListener(PriceListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PriceListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notify(String name, Long price) {
        listeners.forEach(listener -> listener.onEvent(name, price));
    }
}
