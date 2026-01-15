import java.util.Scanner;

public class C06Q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Prompt the user to enter the width
        System.out.print("Enter the width: ");
        int width = input.nextInt();

        // Get the formatted number
        String formattedNumber = format(number, width);

        // Display the formatted number
        System.out.println("Formatted number: " + formattedNumber);
    }

    /** Method to format the number with the specified width */
    public static String format(int number, int width) {
        String numberStr = Integer.toString(number);

        // If the number is already longer than or equal to the width, return it as is
        if (numberStr.length() >= width) {
            return numberStr;
        }

        // Calculate the number of leading zeros required
        int leadingZeros = width - numberStr.length();

        // Build the formatted string with leading zeros
        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < leadingZeros; i++) {
            formatted.append('0');
        }
        formatted.append(numberStr);

        return formatted.toString();
    }
}
