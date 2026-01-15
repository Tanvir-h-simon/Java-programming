import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the exchange rate
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = scan.nextDouble();

        // Prompt the user to choose the conversion direction
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int conversionDirection = scan.nextInt();

        // Perform the conversion based on the input
        if (conversionDirection == 0) {
            // Convert dollars to RMB
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = scan.nextDouble();
            double rmbAmount = dollarAmount * exchangeRate;
            System.out.printf("$%.2f is %.2f yuan\n", dollarAmount, rmbAmount);
        } else if (conversionDirection == 1) {
            // Convert RMB to dollars
            System.out.print("Enter the RMB amount: ");
            double rmbAmount = scan.nextDouble();
            double dollarAmount = rmbAmount / exchangeRate;
            System.out.printf("%.2f yuan is $%.2f\n", rmbAmount, dollarAmount);
        } else {
            // Invalid input for conversion direction
            System.out.println("Incorrect input");
        }
    }
}