import java.util.Scanner;

public class C05Q36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for first 9 digits of ISBN
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        // Convert to string and ensure leading zeros
        String isbnString = String.format("%09d", isbn);

        int checksum = 0;
        // Calculate the checksum using loop
        for (int i = 0; i < 9; i++) {
            int digit = isbnString.charAt(i) - '0'; // Convert character to integer
            checksum += digit * (i + 1);
        }

        // Compute d10
        int d10 = checksum % 11;

        // Append the checksum to the ISBN
        String isbn10 = isbnString + (d10 == 10 ? "X" : d10);

        // Display result
        System.out.println("The ISBN-10 number is " + isbn10);
    }
}
