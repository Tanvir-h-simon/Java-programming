public class C07Q22 {
    public static void main(String[] args) {
        // Initialize the chessboard
        int[] queens = new int[8]; // queens[i] represents the column index of the queen in row i
        for (int i = 0; i < queens.length; i++) {
            queens[i] = -1; // -1 means no queen is placed in this row
        }

        // Start solving from the first row
        solve(queens, 0);

        // Display the solution
        displayBoard(queens);
    }

    // Recursive method to solve the Eight Queens puzzle
    public static boolean solve(int[] queens, int row) {
        if (row == queens.length) {
            return true; // All queens are placed
        }

        for (int col = 0; col < queens.length; col++) {
            if (isSafe(queens, row, col)) {
                queens[row] = col; // Place the queen in this column
                if (solve(queens, row + 1)) { // Recursively place queens in the next rows
                    return true;
                }
                queens[row] = -1; // Backtrack if no solution is found
            }
        }

        return false; // No solution found for this row
    }

    // Method to check if placing a queen at (row, col) is safe
    public static boolean isSafe(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || // Same column
                    queens[i] - i == col - row || // Same major diagonal
                    queens[i] + i == col + row) { // Same minor diagonal
                return false;
            }
        }
        return true;
    }

    // Method to display the chessboard
    public static void displayBoard(int[] queens) {
        for (int row = 0; row < queens.length; row++) {
            for (int col = 0; col < queens.length; col++) {
                if (queens[row] == col) {
                    System.out.print("|Q");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
        }
    }
}