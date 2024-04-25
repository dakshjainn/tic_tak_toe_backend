package com.example.tic_tak_toe.Controller;

import com.example.tic_tak_toe.exceptions.InvalidException;
import com.example.tic_tak_toe.models.*;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        //TODO
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
