package ru.vichukano.gof;

public class TerminatorCloneFactory implements RoboFactory {
    private final Terminator PROTOTYPE = new Terminator();

    @Override
    public Robot construct() {
        try {
            return PROTOTYPE.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
