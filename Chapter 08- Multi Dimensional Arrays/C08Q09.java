import java.util.Scanner;

public class C08Q09 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);

        Scanner input = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            displayBoard(board);

            int row = -1, col = -1;
            while (true) {
                System.out.print("Enter a row (0, 1, or 2) for player " + currentPlayer + ": ");
                row = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player " + currentPlayer + ": ");
                col = input.nextInt();

                if (row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            if (isWinner(board, currentPlayer)) {
                displayBoard(board);
                System.out.println(currentPlayer + " player won");
                gameEnded = true;
            } else if (isDraw(board)) {
                displayBoard(board);
                System.out.println("The game is a draw");
                gameEnded = true;
            } else {
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        input.close();
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }

    public static void displayBoard(char[][] board) {
        System.out.println("---------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }

    // Check if the current player has won
    public static boolean isWinner(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || 
                (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }
        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
            (board[0][2] == player && board[1][1] == player && board[2][0] == player))
            return true;

        return false;
    }

    // Check if the board is full (draw)
    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
}