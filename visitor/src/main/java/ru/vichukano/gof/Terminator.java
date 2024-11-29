package ru.vichukano.gof;

public class Terminator implements VisibleRobot {
    final String model;

    public Terminator(String model) {
        this.model = model;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
