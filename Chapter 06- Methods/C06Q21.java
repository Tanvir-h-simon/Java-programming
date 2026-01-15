import java.util.Scanner;

public class C06Q21 {
    public static int getNumber(char letter) {
        letter = Character.toUpperCase(letter); // Convert to uppercase for uniformity
        if (letter >= 'A' && letter <= 'C') return 2;
        else if (letter >= 'D' && letter <= 'F') return 3;
        else if (letter >= 'G' && letter <= 'I') return 4;
        else if (letter >= 'J' && letter <= 'L') return 5;
        else if (letter >= 'M' && letter <= 'O') return 6;
        else if (letter >= 'P' && letter <= 'S') return 7;
        else if (letter >= 'T' && letter <= 'V') return 8;
        else if (letter >= 'W' && letter <= 'Z') return 9;
        else return -1; // Return -1 for non-letter characters
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a phone number as a string
        System.out.print("Enter a string: ");
        String phoneNumber = input.nextLine();

        // Translate the phone number
        StringBuilder translatedNumber = new StringBuilder();
        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            int number = getNumber(ch); // Get the corresponding number
            if (number != -1) {
                translatedNumber.append(number); // Append digit for letters
            } else {
                translatedNumber.append(ch); // Append original character for non-letters
            }
        }
        System.out.println("The translated phone number is: " + translatedNumber);
    }
}
