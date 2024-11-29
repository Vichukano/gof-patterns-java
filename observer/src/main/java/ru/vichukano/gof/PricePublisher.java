package ru.vichukano.gof;

public interface PricePublisher {

    void addListener(PriceListener listener);

    void removeListener(PriceListener listener);

    void notify(String name, Long price);

}
