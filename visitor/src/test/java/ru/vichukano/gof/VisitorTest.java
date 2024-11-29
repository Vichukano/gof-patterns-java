package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

class VisitorTest {

    @Test
    void testVisitorPattern() {
        var robocop = new Robocop("Serve the public trust", "Protect the innocent", "Uphold the law");
        var terminator = new Terminator("T1000");
        var jsonPrinter = new JsonPrinterVisitor();
        var xmlPrinter = new XmlPrinterVisitor();
        terminator.accept(jsonPrinter);
        terminator.accept(xmlPrinter);
        robocop.accept(jsonPrinter);
        robocop.accept(xmlPrinter);
    }

}