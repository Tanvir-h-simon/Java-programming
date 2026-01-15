import java.util.Scanner;

public class C05Q42 {
    public static void main(String[] args) {
        final double BASE_SALARY = 5000.0;

        Scanner input = new Scanner(System.in);

        // Prompt user for commission sought
        System.out.print("Enter the commission sought: ");
        double targetIncome = input.nextDouble();

        double salesAmount = 0.0;
        double totalEarnings = 0.0;

        for (salesAmount = 0.01; totalEarnings < targetIncome; salesAmount += 0.01) {
            totalEarnings = BASE_SALARY + calculateCommission(salesAmount);
        }

        System.out.printf("The minimum sales required to earn $%.2f is: $%.2f\n", targetIncome, salesAmount);

        input.close();
    }

    public static double calculateCommission(double salesAmount) {
        double commission = 0.0;

        if (salesAmount > 10000) {
            commission += (salesAmount - 10000) * 0.12;
            salesAmount = 10000;
        }
        if (salesAmount > 5000) {
            commission += (salesAmount - 5000) * 0.10;
            salesAmount = 5000;
        }
        commission += salesAmount * 0.08;

        return commission;
    }
}
