package ru.vichukano.gof;

public class RobocopCloneFactory implements RoboFactory {
    private final Robocop PROTOTYPE = new Robocop();

    @Override
    public Robot construct() {
        return new Robocop(PROTOTYPE);
    }

}
