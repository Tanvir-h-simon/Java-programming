import java.util.Scanner;

public class C06Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countDigit = 0;
        boolean isValid = true;

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        // Rule 1: Password must have at least 8 characters
        if (password.length() < 8) {
            isValid = false;
        }

        // Rule 2 and Rule 3: Validate characters and count digits
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                countDigit++;
            } else if (!Character.isLetter(ch)) {
                isValid = false;
            }
        }

        // Rule 3: At least two digits required
        if (countDigit < 2) {
            isValid = false;
        }

        // Display the result
        if (isValid) {
            System.out.println("Valid Password.");
        } else {
            System.out.println("Invalid Password.");
        }
    }
}
