package lab2problem2;

public class Queen extends Piece {

    public Queen(Position position, String color) {
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
