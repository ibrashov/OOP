package lab2problem2;

public class Bishop extends Piece {

    public Bishop(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition, Piece board[][]) {
    	
    	if (Math.abs(position.row - newPosition.row) == Math.abs(position.col - newPosition.col)) {

            int rowStep = (newPosition.row > position.row) ? 1 : -1;
            int colStep = (newPosition.col > position.col) ? 1 : -1;

            int r = position.row + rowStep;
            int c = position.col + colStep;

            while (r != newPosition.row && c != newPosition.col) {

                if (board[r][c] != null) {
                    System.out.println("Obstacle piece");
                    return false;
                }

                r += rowStep;
                c += colStep;
            }
            return true;
        }
    	
    	return false;
    	
    }
}
