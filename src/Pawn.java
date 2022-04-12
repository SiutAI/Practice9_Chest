public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((column == toColumn) && !(line == toLine)) {
            if ((color.equals("White") && line == 1)) {
                return toLine == line + 1 || toLine == line + 2;
            } else if ((color.equals("Black") && line == 6)) {
                return toLine == line - 1 || toLine == line - 2;
            } else {
                return (color.equals("Black") && toLine == line - 1 && toLine >= 0) ||
                        (color.equals("White") && toLine == line + 1 && toLine <= 7);
            }
        }
            return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
