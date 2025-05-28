package br.viniciushfc.chess;

import br.viniciushfc.boardgame.Board;
import br.viniciushfc.boardgame.Piece;
import br.viniciushfc.boardgame.Position;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
