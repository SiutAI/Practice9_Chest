public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Black");
        ChessBoard board = new ChessBoard("Black");

        //board.printBoard();

        System.out.println(horse.canMoveToPosition(board, 0 , 7 , 2, 7));

    }
}
