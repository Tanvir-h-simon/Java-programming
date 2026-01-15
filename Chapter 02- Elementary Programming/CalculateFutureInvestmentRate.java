import java.util.Scanner;
public class CalculateFutureInvestmentRate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = scan.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = scan.nextDouble();
        System.out.print("Enter number of years: ");
        double numberOfYears = scan.nextDouble();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        double futureInvestmentRate = investmentAmount * (Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)));

        System.out.println("Accumulated value is " + futureInvestmentRate);
    }
}
