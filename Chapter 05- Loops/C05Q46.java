import java.util.Scanner;

public class C05Q46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Variable to store the reversed string
        String reversedString = "";

        // Loop through the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        // Display the reversed string
        System.out.println("The reversed string is " + reversedString);
    }
}
