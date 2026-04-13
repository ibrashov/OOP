package lab2problem2;

class Knight extends Piece {
    public Knight(Position position, Color color) { super(position, color); }
 
    @Override
    public boolean isLegalMove(Position b) {
        if (position.equals(b)) return false;
        int dc = Math.abs(position.col - b.col);
        int dr = Math.abs(position.row - b.row);
        // L-shape: (2,1) or (1,2)
        return (dc == 2 && dr == 1) || (dc == 1 && dr == 2);
    }
 
    @Override public char   getSymbol()  { return color == Color.WHITE ? 'N' : 'n'; }
    @Override public String getUnicode() { return color == Color.WHITE ? "♘" : "♞"; }
}
