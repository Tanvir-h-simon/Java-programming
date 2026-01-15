import java.util.Scanner;

public class C05Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        // Calculate total payment
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);

        // Display amortization schedule
        System.out.println("Payment#     Interest     Principal      Balance");

        double balance = loanAmount;
        int paymentNumber = 1;

        // Loop to generate amortization schedule
        while (paymentNumber <= numberOfYears * 12) {
            double interest = balance * monthlyInterestRate;
            double principal = monthlyPayment - interest;
            balance -= principal;

            System.out.printf("%-12d %-12.2f %-12.2f   %.2f\n", paymentNumber, interest, principal, balance);

            paymentNumber++;
        }
    }
}