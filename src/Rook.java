public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkPos(toColumn) && chessBoard.checkPos(toLine)) {
            return (toColumn == column && toLine != line) || (toLine == line && toColumn != column);
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
