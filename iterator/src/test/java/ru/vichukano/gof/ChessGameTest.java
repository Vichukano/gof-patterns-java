package ru.vichukano.gof;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

class ChessGameTest {

    @Test
    void testIteratorPattern() {
        var game = new ChessGame();
        game.makeMove("e2-e4");
        game.makeMove("e7-e5");
        game.makeMove("Cf1-c4");
        game.makeMove("Cf8-c5");
        game.makeMove("Фd1-f3");
        game.makeMove("Kb8-c6");
        game.makeMove("Фf3xf7#");
        game.printGameStatistic();

        Iterator<String> gameIter = game.iterator();
        while (gameIter.hasNext()) {
            System.out.println(gameIter.next());
        }
    }
}