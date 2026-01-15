import java.util.Scanner;
import java.util.Random;

public class C06Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        // Call the method to print the matrix
        printMatrix(n);
    }

    public static void printMatrix(int n){
        Random rand = new Random();

        // Generate an n-by-n matrix
        for (int i = 0; i < n; i++){ // Rows
            for (int j = 0; j < n; j++){ // Columns
                // Generate and print a random number (0 or 1)
                // int element = (int) (Math.random() * 2);
                int element = rand.nextInt(2);
                System.out.print(element + " ");
                }
            System.out.println();
        }
    }
}