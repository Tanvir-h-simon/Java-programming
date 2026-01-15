import java.util.Scanner;

public class C05Q47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first 12 digits of the ISBN-13
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn12 = scanner.nextLine();

        // Check if the input has exactly 12 digits
        if (isbn12.length() != 12 || !isbn12.matches("\\d{12}")) {
            System.out.println(isbn12 + " is an invalid input");
        } else {
            int sum = 0;

            // Loop to calculate the alternating sum for ISBN-13
            for (int i = 0; i < 12; i++) {
                int digit = Character.getNumericValue(isbn12.charAt(i));
                // Add the digit directly if the index is even, multiply by 3 if it's odd
                if (i % 2 == 0) {
                    sum += digit;  // even indices: d1, d3, d5, d7, d9, d11
                } else {
                    sum += 3 * digit;  // odd indices: d2, d4, d6, d8, d10, d12
                }
            }

            // Calculate the checksum
            int checksum = (10 - (sum % 10)) % 10;

            // If checksum is 10, replace it with 0
            if (checksum == 10) {
                checksum = 0;
            }

            // Print the full ISBN-13 number
            System.out.println("The ISBN-13 number is " + isbn12 + checksum);
        }
    }
}
