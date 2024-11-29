package ru.vichukano.gof;

public class Robot {
    private final String name;
    private final int serialNumber;
    private final Type type;
    private final boolean isFriendly;

    private Robot(Builder builder) {
        this.name = builder.name;
        this.serialNumber = builder.serialNumber;
        this.type = builder.type;
        this.isFriendly = builder.isFriendly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Type getType() {
        return type;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public static class Builder {
        private String name;
        private int serialNumber;
        private Type type;
        private boolean isFriendly;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder serialNumber(int number) {
            this.serialNumber = number;
            return this;
        }

        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Builder friendly(boolean isFriendly) {
            this.isFriendly = isFriendly;
            return this;
        }

        public Robot build() {
            return new Robot(this);
        }
    }

    public enum Type {
        CYBORG
    }

}
