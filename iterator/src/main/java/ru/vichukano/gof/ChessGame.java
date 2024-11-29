package ru.vichukano.gof;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ChessGame implements Iterable<String> {
    private final List<String> moves = new LinkedList<>();

    public void makeMove(String moveNotation) {
        moves.add(moveNotation);
    }

    public void printGameStatistic() {
        System.out.println("Game started!");
        for (int i = 0; i < moves.size(); i++) {
            var first = i + "." + " " + moves.get(i);
            String second;
            if (moves.size() == (i + 1)) {
                second = "";
            } else {
                second = " " + moves.get(i + 1);
            }
            System.out.println(first + second);
            i++;
        }
        System.out.println("Game finished!");
    }

    @Override
    public Iterator<String> iterator() {
        return new ChessGameIterator(this.moves);
    }
}
