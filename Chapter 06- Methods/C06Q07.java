import java.util.Scanner;

public class C06Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter investment amount and interest rate
        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = (annualInterestRate / 100)  / 12;

        // Display the table header
        System.out.println("\nYears     Future Value");
        System.out.println("----------------------");

        // Loop through 1 to 30 years and display future investment values
        for (int years = 1; years <= 30; years++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%-11d%10.2f\n", years, futureValue);
        }
    }

    // Method to calculate future investment value
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
