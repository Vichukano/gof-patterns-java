package ru.vichukano.gof;

public final class LazyNonThreadSafeSingleton {
    private static LazyNonThreadSafeSingleton instance;

    private LazyNonThreadSafeSingleton() {
    }

    public static LazyNonThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyNonThreadSafeSingleton();
        }
        return instance;
    }

}
