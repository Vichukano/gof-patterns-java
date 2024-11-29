package ru.vichukano.gof;

import java.util.Arrays;

public class XmlPrinterVisitor implements Visitor {

    @Override
    public void visit(Robocop robocop) {
        System.out.println("Print robocop in XML");
        System.out.println("<name>Robocop</name><directives>" + Arrays.toString(robocop.directives) + "</directives>");

    }

    @Override
    public void visit(Terminator terminator) {
        System.out.println("Print terminator in XML");
        System.out.println("<name>Terminator</name><model>" + terminator.model + "</model>");
    }

}
