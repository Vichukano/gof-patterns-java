package ru.vichukano.gof;

import java.util.Iterator;
import java.util.List;

public class ChessGameIterator implements Iterator<String> {
    private final List<String> moves;
    private int currIdx = 0;

    public ChessGameIterator(List<String> moves) {
        this.moves = moves;
    }

    @Override
    public boolean hasNext() {
        return currIdx < moves.size();
    }

    @Override
    public String next() {
        var move = moves.get(currIdx);
        currIdx++;
        return move;
    }
}

