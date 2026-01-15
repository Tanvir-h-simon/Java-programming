import java.util.Scanner;

public class C07Q30 {

    // Method to check if the array contains four consecutive equal numbers
    public static boolean isConsecutiveFour(int[] values) {
        // Check each element (except the last three) for consecutive fours
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                return true; // Found four consecutive equal numbers
            }
        }
        return false; // No consecutive fours found
    }

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of values
        System.out.print("Enter the number of values: ");
        int size = input.nextInt();

        // Create an array to store the values
        int[] values = new int[size];

        // Prompt the user to enter the values
        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }

        // Check if the array contains four consecutive equal numbers
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }
}