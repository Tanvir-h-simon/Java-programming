import java.util.Scanner;

public class C05Q21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        int loanAmount = input.nextInt();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");

        // Loop through interest rates from 5% to 8% in increments of 1/8%
        for (double rate = 5; rate <= 8; rate += 0.125){
            // Calculate monthly interest rate
            double monthlyRate = rate / (12 * 100);
            // Calculate the number of months
            double numberOfMonths = years * 12;
            // Monthly payment calculation using the loan payment formula
            double monthlyPayment = loanAmount * monthlyRate / (1 - (1 / Math.pow(1 + monthlyRate, numberOfMonths)));
            // Total payment calculation
            double totalPayment = monthlyPayment * numberOfMonths;

            System.out.printf("%.3f%%\t%14.2f\t%16.2f\n", rate, monthlyPayment, totalPayment);
        }
    }
}
