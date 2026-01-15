import java.util.Scanner;

public class C05Q48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Variable to store the characters at odd positions
        StringBuilder result = new StringBuilder();

        // Loop through the string and select characters at odd positions (1-based index)
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {  // Even index (0-based) corresponds to odd positions (1-based)
                result.append(input.charAt(i));
            }
        }
        // Display the result
        System.out.println(result.toString());
    }
}
