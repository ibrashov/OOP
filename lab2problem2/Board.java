package lab2problem2;

public class Board {

    protected Piece[][] board = new Piece[8][8];
    private String currentTurn = "white";

    public void setup() {
        board[0][0] = new Rook(new Position(0,0),"black");
        board[0][1] = new Horse(new Position(0,1),"black");
        board[0][2] = new Bishop(new Position(0,2),"black");
        board[0][3] = new Queen(new Position(0,3),"black");
        board[0][4] = new King(new Position(0,4),"black");
        board[0][5] = new Bishop(new Position(0,5),"black");
        board[0][6] = new Horse(new Position(0,6),"black");
        board[0][7] = new Rook(new Position(0,7),"black");

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Position(1,i),"black");
        }

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(new Position(6,i),"white");
        }

        board[7][0] = new Rook(new Position(7,0),"white");
        board[7][1] = new Horse(new Position(7,1),"white");
        board[7][2] = new Bishop(new Position(7,2),"white");
        board[7][3] = new Queen(new Position(7,3),"white");
        board[7][4] = new King(new Position(7,4),"white");
        board[7][5] = new Bishop(new Position(7,5),"white");
        board[7][6] = new Horse(new Position(7,6),"white");
        board[7][7] = new Rook(new Position(7,7),"white");
    }

    public String getCurrentTurn() {
        return currentTurn;
    }

    public void printBoard() {
        System.out.println();
        System.out.println("    a b c d e f g h");
        System.out.println("   -----------------");

        for (int r = 0; r < 8; r++) {
            System.out.print((8 - r) + " | ");

            for (int c = 0; c < 8; c++) {
                if (board[r][c] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(symbol(board[r][c]) + " ");
                }
            }

            System.out.println("| " + (8 - r));
        }

        System.out.println("   -----------------");
        System.out.println("    a b c d e f g h");
        System.out.println();
    }

    private char symbol(Piece p) {
        char ch = '?';

        if (p instanceof Pawn) ch = 'P';
        if (p instanceof Rook) ch = 'R';
        if (p instanceof Horse) ch = 'H';
        if (p instanceof Bishop) ch = 'B';
        if (p instanceof Queen) ch = 'Q';
        if (p instanceof King) ch = 'K';

        if (p.getColor().equals("black")) {
            ch = Character.toLowerCase(ch);
        }

        return ch;
    }

    public boolean movePiece(Position from, Position to) {
        if (from == null || to == null) {
            System.out.println("Incorrect position");
            return false;
        }

        Piece p = board[from.row][from.col];

        if (p == null) {
            System.out.println("No piece at " + from);
            return false;
        }

        if (!p.getColor().equals(currentTurn)) {
            System.out.println("Now it is " + currentTurn + "'s turn");
            return false;
        }

        if (!p.isLegalMove(to, board)) {
            System.out.println("Illegal move");
            return false;
        }

        Piece target = board[to.row][to.col];

        if (target != null && target.getColor().equals(p.getColor())) {
            System.out.println("Cannot capture own piece");
            return false;
        }

        board[to.row][to.col] = p;
        board[from.row][from.col] = null;
        p.setPosition(to);

        currentTurn = currentTurn.equals("white") ? "black" : "white";

        System.out.println("Move successful: " + from + " -> " + to);
        return true;
    }
}