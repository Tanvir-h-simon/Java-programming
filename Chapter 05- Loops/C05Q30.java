import java.util.Scanner;

public class C05Q30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Amount, annual interest rate, and number of months
        System.out.print("Enter the monthly deposit amount: ");
        double depositAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Calculate the total amount in the account after the given months
        double accountBalance = 0;

        for (int i = 1; i <= months; i++) {
            accountBalance = (accountBalance + depositAmount) * (1 + monthlyInterestRate);
        }

        // Display the amount in the savings account after the given months
        System.out.printf("The amount in the savings account after %d months is: $%.2f%n", months, accountBalance);
    }
}
