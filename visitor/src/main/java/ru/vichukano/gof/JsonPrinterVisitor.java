package ru.vichukano.gof;

import java.util.Arrays;

public class JsonPrinterVisitor implements Visitor {

    @Override
    public void visit(Robocop robocop) {
        System.out.println("Print robocop in JSON");
        System.out.println("{\"name\": \"Robocop\", \"directives\": " + Arrays.toString(robocop.directives));
    }

    @Override
    public void visit(Terminator terminator) {
        System.out.println("Print terminator in JSON");
        System.out.println("{\"name\": \"Terminator\", \"model\": " + terminator.model);
    }
}
