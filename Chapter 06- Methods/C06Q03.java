import java.util.Scanner;

public class C06Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        // Call reverse method to display the reversed number
        System.out.println("The reversed number is " + reverse(number));
    }

    // Method to reverse an integer
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse; // Return the reversed number
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number); 
    }
}
