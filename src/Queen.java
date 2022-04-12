public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkPos(toColumn) && chessBoard.checkPos(toLine)) {
            if (toColumn == column || toLine == line) {
                return (toLine != line) || (toColumn != column);
            } else {
                return (Math.abs(toLine - line) == Math.abs(toColumn - column));
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
