package apiNeedToReadCareFully.IO;

public class Cell {

    public int gameBoard;
    public boolean Flagged;

    public int getGameBoard() {
        return gameBoard;
    }
    public void setGameBoard(int gameBoard) {
        this.gameBoard = gameBoard;
    }

    public boolean isFlagged() {
        return Flagged;
    }

    public void setFlagged(boolean flagged) {
        Flagged = flagged;
    }

    public Cell(int gameBoard, boolean flagged) {
        this.gameBoard = gameBoard;
        Flagged = flagged;
    }

    public Cell() {
    }

}
