package lab2problem2;

public class Horse extends Piece {

    public Horse(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition, Piece board[][]) {

        int dx = Math.abs(position.row - newPosition.row);
        int dy = Math.abs(position.col - newPosition.col);

        return (dx == 2 && dy == 1) ||
               (dx == 1 && dy == 2);
    }
}

// upgrade impossible positions