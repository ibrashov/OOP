package lab2problem2;

public class King extends Piece {

    public King(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition, Piece board[][]) {

        int dx = Math.abs(position.row - newPosition.row);
        int dy = Math.abs(position.col - newPosition.col);

        return dx <= 1 && dy <= 1;
    }
}
