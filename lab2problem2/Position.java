package lab2problem2;

public class Position {
    int row;
    int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public static Position fromChessNotation(String s) {
        s = s.toLowerCase();

        if (s.length() != 2) {
            return null;
        }

        char file = s.charAt(0); // a-h
        char rank = s.charAt(1); // 1-8

        if (file < 'a' || file > 'h' || rank < '1' || rank > '8') {
            return null;
        }

        int col = file - 'a';	
        int row = 8 - (rank - '0');

        return new Position(row, col);
    }

    @Override
    public String toString() {
        char file = (char) ('a' + col);
        int rank = 8 - row;
        return "" + file + rank;
    }
}