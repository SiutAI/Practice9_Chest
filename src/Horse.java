public class Horse extends ChessPiece{

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (chessBoard.checkPos(toLine)) &&
                (chessBoard.checkPos(toColumn)) &&
                (((toLine == line + 1 || toLine == line - 1) &&
                (toColumn == column + 2 || toColumn == column - 2)) ||
                ((toLine == line + 2 || toLine == line - 2) &&
                (toColumn == column + 1 || toColumn == column - 1)));
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
