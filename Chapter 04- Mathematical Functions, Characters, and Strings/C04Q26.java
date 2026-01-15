import java.util.Scanner;

public class C04Q26 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount as a string
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amountStr = input.nextLine();

        // Find the position of the decimal point
        int decimalIndex = amountStr.indexOf(".");

        // Extract dollars and cents from the input string
        int dollars = Integer.parseInt(amountStr.substring(0, decimalIndex)); // Get the dollar part
        int cents = Integer.parseInt(amountStr.substring(decimalIndex + 1)); // Get the cents part

        // Compute the total amount in cents
        int totalCents = dollars * 100 + cents;

        // Find the number of one dollar
        int numberOfOneDollars = totalCents / 100;
        totalCents = totalCents % 100;

        // Find the number of quarters
        int numberOfQuarters = totalCents / 25;
        totalCents = totalCents % 25;

        // Find the number of dimes
        int numberOfDimes = totalCents / 10;
        totalCents = totalCents % 10;

        // Find the number of nickels
        int numberOfNickels = totalCents / 5;
        totalCents = totalCents % 5;

        // The remaining cents are pennies
        int numberOfPennies = totalCents;

        // Display results
        System.out.println("Your amount " + amountStr + " consists of:");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}
