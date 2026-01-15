import java.util.Scanner;

public class C04Q19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the first 9 digits of the ISBN
        System.out.print("Enter the first 9 digits of an ISBN as a string: ");
        String isbn = scan.nextLine();

        // Validate input length
        if (isbn.length() != 9 || !isbn.matches("[0-9]+")) {
            System.out.println("Invalid input. Please enter exactly 9 digits.");
            return;
        }

        int checksum = 0;

        // Calculate checksum
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            checksum += digit * (i + 1);
        }

        checksum %= 11;

        // Append checksum to the original 9 digits
        String isbn10 = isbn + (checksum == 10 ? 'X' : checksum);

        // Display the full ISBN-10
        System.out.println("The ISBN-10 number is " + isbn10);
    }
}