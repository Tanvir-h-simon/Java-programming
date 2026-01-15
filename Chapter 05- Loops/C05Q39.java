public class C05Q39 {
    public static void main(String[] args) {
        final double BASE_SALARY = 5000.0;
        final double TARGET_INCOME = 30000.0;

        double salesAmount = 0.0;
        double totalEarnings = 0.0;

        while (totalEarnings < TARGET_INCOME) {
            salesAmount += 0.01; // Increment sales gradually
            totalEarnings = BASE_SALARY + calculateCommission(salesAmount);
        }

        System.out.printf("The minimum sales required to earn $30,000 is: $%.2f\n", salesAmount);
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
