import java.util.Scanner;
public class MonetaryUnits{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an amount of dollars: ");
        double amount = scan.nextDouble();

        // For mathematical calculations
        double remainingAmount = amount * 100;
        // Find the number of one dollars
        int numberOfDollars = (int) remainingAmount / 100;

        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = (int) remainingAmount / 25;

        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = (int) remainingAmount / 10;

        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = (int) remainingAmount / 5;

        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = (int) remainingAmount;

        System.out.println("Amount of dollars $" + amount + " = " + numberOfDollars + " Dollars " + numberOfQuarters + " Quarters " + numberOfDimes + " Dimes " + numberOfNickels + " Nickels " + numberOfPennies + " Pennies");
    }
}