package br.viniciushfc.boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece() {
    }

    public Piece(Position position, Board board) {
        this.board = board;
    }

    public Piece(Board board) {
    }

    protected Board getBoard() {
        return board;
    }

}
