import java.util.Scanner;

public class C05Q32 {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Generate the first digit of the lottery number
        int firstDigit = (int) (Math.random() * 10);

        // Generate the second digit of the lottery number (ensure it is distinct)
        int secondDigit;
        do {
            secondDigit = (int) (Math.random() * 10);
        } while (secondDigit == firstDigit); // Keep generating until the second digit is distinct

        // Prompt the user to enter their lottery number
        System.out.print("Enter your lottery number (two distinct digits): ");
        int userLottery = scanner.nextInt();

        // Extract the user's lottery digits
        int userFirstDigit = userLottery / 10; // Tens place
        int userSecondDigit = userLottery % 10; // Ones place

        // Check if the user won
        if (userFirstDigit == firstDigit && userSecondDigit == secondDigit) {
            System.out.println("Exact match! You win the lottery!");
        } else if (userFirstDigit == secondDigit && userSecondDigit == firstDigit) {
            System.out.println("Match all digits, but in reverse order! You win a consolation prize.");
        } else {
            System.out.println("Sorry, no match.");
        }
        // Display the lottery number
        System.out.println("The lottery number is: " + firstDigit + secondDigit);
    }
}
