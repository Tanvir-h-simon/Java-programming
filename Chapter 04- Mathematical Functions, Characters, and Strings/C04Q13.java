import java.util.Scanner;

public class C04Q13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = scan.nextLine().toLowerCase().charAt(0);

        if (!Character.isLetter(letter)) { // This method check if the character is a letter or not.
            System.out.println(letter + " is a invalid input.");
        } else {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        }
    }
}