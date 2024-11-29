package ru.vichukano.gof;

public class MarketManager implements PriceListener {

    @Override
    public void onEvent(String name, Long price) {
        System.out.println("New price of " + name + " is " + price);
    }

}
