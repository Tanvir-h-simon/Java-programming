import java.util.Arrays;
import java.util.Scanner;

public class C07Q34 {

    // Method to sort the string
    public static String sort(String s) {
        // Convert string to character array
        char[] characters = s.toCharArray();

        // Sort the character array
        Arrays.sort(characters);

        // Convert sorted character array back to string
        return new String(characters);
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Sort the string and display the result
        String sortedString = sort(userInput);
        System.out.println("Sorted string: " + sortedString);
    }
}