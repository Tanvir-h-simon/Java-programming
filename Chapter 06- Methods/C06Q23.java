import java.util.Scanner;

public class C06Q23 {
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) { // Check if the character matches
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Prompt the user to enter a character
        System.out.print("Enter a character to count: ");
        char ch = input.next().charAt(0);

        // Call the method and display the result
        int occurrences = count(str, ch);
        System.out.println("The character '" + ch + "' occurs " + occurrences + " times in the string.");
    }
}
