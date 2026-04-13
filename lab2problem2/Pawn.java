package lab2problem2;

public class Pawn extends Piece {

    public Pawn(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition, Piece[][] board) {

        int rowDiff = newPosition.row - position.row;
        int colDiff = newPosition.col - position.col;

        if (color.equals("white")) {

            if (rowDiff == -1 && colDiff == 0 && board[newPosition.row][newPosition.col] == null ) {
                return true;
            }
            if(position.row == 6 && rowDiff ==-2 && colDiff == 0 && board[5][position.col] == null && board[newPosition.row][newPosition.col] == null) {
            	return true;
            }

            if (rowDiff == -1 && Math.abs(colDiff) == 1) {
                Piece target = board[newPosition.row][newPosition.col];
                if (target != null && !target.getColor().equals(this.color)) {
                    return true;
                }
            }
        }

        else if (color.equals("black")) {

            if (rowDiff == 1 && colDiff == 0 && board[newPosition.row][newPosition.col] == null) {
                return true;
            }
            if(position.row == 1 && rowDiff == 2 && colDiff == 0 && board[2][position.col] == null && board[newPosition.row][newPosition.col] == null) {
            	return true;
            }

            if (rowDiff == 1 && Math.abs(colDiff) == 1) {
                Piece target = board[newPosition.row][newPosition.col];
                if (target != null && !target.getColor().equals(this.color)) {
                    return true;
                }
            }
        }

        return false;
    }
}