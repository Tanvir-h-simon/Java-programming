import java.util.Scanner;

public class C06Q20 {
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) { // Check if the character is a letter
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Call the method and display the result
        int letterCount = countLetters(userInput);
        System.out.println("The number of letters in the string is: " + letterCount);
    }
}
