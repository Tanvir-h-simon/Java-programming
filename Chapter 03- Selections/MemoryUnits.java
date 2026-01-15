import java.util.Scanner;

public class MemoryUnits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter an amount in double: ");
        double amount = scan.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");

        if (numberOfDollars > 0) {
            System.out.println("    " + numberOfDollars + " " + (numberOfDollars == 1 ? "dollar" : "dollars"));
        }
        if (numberOfQuarters > 0) {
            System.out.println("    " + numberOfQuarters + " " + (numberOfQuarters == 1 ? "quarter" : "quarters"));
        }
        if (numberOfDimes > 0) {
            System.out.println("    " + numberOfDimes + " " + (numberOfDimes == 1 ? "dime" : "dimes"));
        }
        if (numberOfNickels > 0) {
            System.out.println("    " + numberOfNickels + " " + (numberOfNickels == 1 ? "nickel" : "nickels"));
        }
        if (numberOfPennies > 0) {
            System.out.println("    " + numberOfPennies + " " + (numberOfPennies == 1 ? "penny" : "pennies"));
        }
    }
}
