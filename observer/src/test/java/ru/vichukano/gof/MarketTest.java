package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

class MarketTest {

    @Test
    void testObserverPattern() {
        PriceListener customer = new Customer();
        PriceListener manager = new MarketManager();
        PricePublisher publisher = new MarkerPricePublisher();
        publisher.addListener(customer);
        publisher.addListener(manager);
        var market = new Market(publisher);
        market.changePrice("Corn", 100L);
        market.changePrice("Milk", 200L);
    }

}