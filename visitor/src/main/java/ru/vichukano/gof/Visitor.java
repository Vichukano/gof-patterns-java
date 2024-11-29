package ru.vichukano.gof;

public interface Visitor {

    void visit(Robocop robocop);

    void visit(Terminator terminator);
}
