package ru.vichukano.gof;

public class Customer implements PriceListener {

    @Override
    public void onEvent(String name, Long price) {
        System.out.println("Price of " + name + " has been changed to " + price);
    }

}
