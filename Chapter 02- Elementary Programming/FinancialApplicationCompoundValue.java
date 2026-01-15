import java.util.Scanner;
public class FinancialApplicationCompoundValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double P = scan.nextDouble(); // Monthly saving amount = P
        System.out.print("Enter the yearly interest rate in percentage: ");
        double r = scan.nextDouble(); // Yearly interest rate = r
        double rMonthly = (r / 100) / 12;
        System.out.print("Enter the number of months: ");
        double n = scan.nextInt(); // Number of months = n

        double accountValue = (P * (Math.pow((1 + rMonthly), n) - 1)) / rMonthly;

        System.out.println("After the " + n + " month, the account value is $" + accountValue);
    }
}
