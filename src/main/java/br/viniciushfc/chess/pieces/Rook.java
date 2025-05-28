package br.viniciushfc.chess.pieces;

import br.viniciushfc.boardgame.Board;
import br.viniciushfc.chess.ChessPiece;
import br.viniciushfc.chess.Color;

public class Rook extends ChessPiece {


    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getCollumns()];
        return mat;
    }
}
