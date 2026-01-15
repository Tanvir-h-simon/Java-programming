import java.util.Scanner;

public class C05Q31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Initial deposit amount, annual percentage yield, and number of months
        System.out.print("Enter the initial deposit amount: ");
        double depositAmount = scanner.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualPercentageYield = scanner.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int months = scanner.nextInt();

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualPercentageYield / 1200;

        // Display the header for the table
        System.out.println("Month  CD Value");

        // Loop through each month and calculate the CD value
        double currentCDValue = depositAmount;
        for (int month = 1; month <= months; month++) {
            currentCDValue += currentCDValue * monthlyInterestRate;

            // Display the month and the current CD value
            System.out.printf("%-6d %.2f%n", month, currentCDValue);
        }
    }
}
