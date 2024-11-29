package ru.vichukano.gof;

public class SuperDuperStringHandler extends BaseSomethingHandler<String> {

    @Override
    protected void log(String something) {
        System.out.println("log this: " + something);
    }

    @Override
    protected void cleanup() {
        System.out.println("clean up cache after something has been handled");
    }
}
