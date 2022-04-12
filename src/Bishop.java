public class Bishop extends ChessPiece{
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!(column == toColumn) && !(line == toLine) &&
            checkOnBoard(toColumn) && checkOnBoard(toLine)) {
            return (Math.abs(toLine - line) == Math.abs(toColumn - column));
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
