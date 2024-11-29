package ru.vichukano.gof;

public final class LazyThreadSafeSingleton {
    private static volatile LazyThreadSafeSingleton instance;

    private LazyThreadSafeSingleton() {

    }

    public static LazyThreadSafeSingleton getInstance() {
        if (instance == null) {
            //тут важно синхронизироваться на классе, а не по this
            synchronized (LazyThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new LazyThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
