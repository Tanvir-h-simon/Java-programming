public class C06Q11 {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-15s%-15s\n", "Sales Amount", "Commission");
        System.out.println("-------------------------");

        // Generate table rows for sales amounts from 10,000 to 100,000 in increments of 5,000
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            double commission = computeCommission(salesAmount);
            System.out.printf("%-15.0f%-15.2f\n", salesAmount, commission);
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission = 0;

        if (salesAmount > 10000) {
            commission += (Math.min(salesAmount, 20000) - 10000) * 0.05;
        }
        if (salesAmount > 20000) {
            commission += (Math.min(salesAmount, 50000) - 20000) * 0.10;
        }
        if (salesAmount > 50000) {
            commission += (salesAmount - 50000) * 0.12;
        }
        return commission;
    }
}
