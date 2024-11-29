package ru.vichukano.gof;

public class Market {
    private final PricePublisher publisher;

    public Market(PricePublisher publisher) {
        this.publisher = publisher;
    }

    public void changePrice(String name, Long newPrice) {
        publisher.notify(name, newPrice);
    }

}
