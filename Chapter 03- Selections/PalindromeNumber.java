import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int num = sc.nextInt();

        // Check if the number is a three-digit integer
        if (num < 100 || num > 999) {
            System.out.print("Invalid input!");
            return;
        }

        int thirdDigit = num % 10;
        int secondDigit = (num / 10) % 10;
        int firstDigit = num / 100;

        if (thirdDigit == firstDigit) {
            System.out.print(num + " is a palindrome.");
        } else {
            System.out.print(num + " is not a palindrome.");
        }
    }
}
