package ru.vichukano.gof;

public final class LazyThreadSafeHolderSingleton {
    private LazyThreadSafeHolderSingleton() {

    }

    private static class Holder {
        private static final LazyThreadSafeHolderSingleton INSTANCE = new LazyThreadSafeHolderSingleton();
    }

    public LazyThreadSafeHolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
