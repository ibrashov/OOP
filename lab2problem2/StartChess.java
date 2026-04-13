package lab2problem2;

import java.util.Scanner;

public class StartChess {

    public static void main(String[] args) {
        Board board = new Board();
        board.setup();

        Scanner sc = new Scanner(System.in);

        while (true) {
            board.printBoard();
            System.out.println("Turn: " + board.getCurrentTurn());
            System.out.println("Enter move like: e2 e4");
            System.out.println("Type exit to quit");

            String first = sc.next();

            if (first.equalsIgnoreCase("exit")) {
                System.out.println("Game ended");
                break;
            }

            String second = sc.next();

            Position from = Position.fromChessNotation(first);
            Position to = Position.fromChessNotation(second);

            if (from == null || to == null) {
                System.out.println("Wrong format. Example: e2 e4");
                continue;
            }

            board.movePiece(from, to);
        }

        sc.close();
    }
}