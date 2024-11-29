package ru.vichukano.gof;

public class Robocop implements VisibleRobot {
    final String[] directives;

    public Robocop(String... directives) {
        this.directives = directives;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
