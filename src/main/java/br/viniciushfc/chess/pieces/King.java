package br.viniciushfc.chess.pieces;

import br.viniciushfc.boardgame.Board;
import br.viniciushfc.chess.ChessPiece;
import br.viniciushfc.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
