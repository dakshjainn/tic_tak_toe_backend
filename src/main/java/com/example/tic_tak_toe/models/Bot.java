package com.example.tic_tak_toe.models;
import java.util.List;

public class Bot extends Player{
    private BotDifficulty botDifficultyLevel;
    public Bot(String name, Symbol symbol, PlayerType playerType, BotDifficulty botDifficultyLevel) {
        super(name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(cell, this);
                }
            }
        }
        return null;
    }
}
