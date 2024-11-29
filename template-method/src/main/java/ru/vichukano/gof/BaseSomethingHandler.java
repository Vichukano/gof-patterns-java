package ru.vichukano.gof;

public abstract class BaseSomethingHandler<T> {

    public void handle(T something) {
        log(something);
        System.out.println("Do something important...");
        cleanup();
    }

    protected abstract void log(T something);

    protected abstract void cleanup();

}
