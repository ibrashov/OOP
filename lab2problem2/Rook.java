package lab2problem2;

public class Rook extends Piece {

    public Rook(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition, Piece board[][]) {
    	
    	if (position.row == newPosition.row) {
            if (position.col < newPosition.col) {
                for (int i = position.col + 1; i < newPosition.col; i++) {
                    if (board[position.row][i] != null) {
                        System.out.println("Obstacle piece");
                        return false;
                    }
                }
            } else {
                for (int i = position.col - 1; i > newPosition.col; i--) {
                    if (board[position.row][i] != null) {
                        System.out.println("Obstacle piece");
                        return false;
                    }
                }
            }
            return true;
        }

        if (position.col == newPosition.col) {
            if (position.row < newPosition.row) {
                for (int i = position.row + 1; i < newPosition.row; i++) {
                    if (board[i][position.col] != null) {
                        System.out.println("Obstacle piece");
                        return false;
                    }
                }
            } else {
                for (int i = position.row - 1; i > newPosition.row; i--) {
                    if (board[i][position.col] != null) {
                        System.out.println("Obstacle piece");
                        return false;
                    }
                }
            }

            return true;
        }
        
        return false;
    }
}
