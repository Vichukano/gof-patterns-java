package ru.vichukano.gof;

import java.util.Objects;

public class Robot {
    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return Objects.equals(name, robot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Robot{name='" + name + "'}";
    }

    public String name() {
        return name;
    }
}
