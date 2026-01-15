import java.util.Scanner;

public class C05Q50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Variable to count the uppercase letters
        int uppercaseCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an uppercase letter
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
        }

        // Display the count of uppercase letters
        System.out.println("The number of uppercase letters is " + uppercaseCount);
    }
}
