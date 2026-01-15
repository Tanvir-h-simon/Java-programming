import java.util.Scanner;

public class C05Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of lines
        System.out.print("Enter the number of lines (1 to 15): ");
        int number = input.nextInt();

        // Input validation
        if (number < 1 || number > 15) {
            System.out.println("Invalid input. Please enter a number between 1 and 15.");
            return;
        }

        // Outer loop for each row
        for (int i = 1; i <= number; i++) {

            // Print leading spaces for pyramid alignment
            for (int j = 1; j <= number - i; j++) {
                System.out.print("   ");
            }

            // Print decreasing numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.printf("%3d", j);
            }

            // Print increasing numbers from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.printf("%3d", j);
            }

            // Move to next line after printing each row
            System.out.println();
        }
    }
}