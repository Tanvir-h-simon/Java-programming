import java.util.Scanner;

public class C05Q18D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int rows = input.nextInt();

        System.out.println("Pattern D");

        // Outer loop for rows
        for (int i = 0; i <= rows; i++){
            // Print leading spaces (increases with each row)
            for (int j = 0; j < i; j++){
                System.out.print("  "); // Three spaces for alignment
            }
            // Print increasing numbers from 1 to (rows - i)
            for (int j = 1; j <= (rows - i); j++){
                System.out.print(j + " ");
            }
            // Go to the next line after completing each row
            System.out.println();
        }
    }
}