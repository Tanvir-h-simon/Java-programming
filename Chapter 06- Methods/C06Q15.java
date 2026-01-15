public class C06Q15 {
    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Income", "", "or Qualifying", "Separate", "House");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "", "", "Window(er)", "", "");
        System.out.println("---------------------------------------------------------------");

        // Print the tax table for incomes from $50,000 to $60,000
        for (int income = 50000; income <= 60000; income += 50) {
            System.out.printf("%-15d", income);
            for (int status = 0; status < 4; status++) {
                System.out.printf("%-15d", Math.round(computeTax(status, income)));
            }
            System.out.println();
        }
    }

    // Method to compute tax based on filing status and taxable income
    public static double computeTax(int status, double taxableIncome) {
        double tax;

        // Tax brackets based on status
        double bracket1 = 0, bracket2 = 0, bracket3 = 0, bracket4 = 0, bracket5 = 0;

        if (status == 0) { // Single filer
            bracket1 = 8350; bracket2 = 33950; bracket3 = 82250;
            bracket4 = 171550; bracket5 = 372950;
        } else if (status == 1) { // Married jointly or qualifying widow(er)
            bracket1 = 16700; bracket2 = 67900; bracket3 = 137050;
            bracket4 = 208850; bracket5 = 372950;
        } else if (status == 2) { // Married separately
            bracket1 = 8350; bracket2 = 33950; bracket3 = 68525;
            bracket4 = 104425; bracket5 = 186475;
        } else if (status == 3) { // Head of household
            bracket1 = 11950; bracket2 = 45500; bracket3 = 117450;
            bracket4 = 190200; bracket5 = 372950;
        }

        // Compute tax using the brackets
        if (taxableIncome <= bracket1) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= bracket2) {
            tax = bracket1 * 0.10 + (taxableIncome - bracket1) * 0.15;
        } else if (taxableIncome <= bracket3) {
            tax = bracket1 * 0.10 + (bracket2 - bracket1) * 0.15 +
                    (taxableIncome - bracket2) * 0.25;
        } else if (taxableIncome <= bracket4) {
            tax = bracket1 * 0.10 + (bracket2 - bracket1) * 0.15 +
                    (bracket3 - bracket2) * 0.25 + (taxableIncome - bracket3) * 0.28;
        } else if (taxableIncome <= bracket5) {
            tax = bracket1 * 0.10 + (bracket2 - bracket1) * 0.15 +
                    (bracket3 - bracket2) * 0.25 + (bracket4 - bracket3) * 0.28 +
                    (taxableIncome - bracket4) * 0.33;
        } else {
            tax = bracket1 * 0.10 + (bracket2 - bracket1) * 0.15 +
                    (bracket3 - bracket2) * 0.25 + (bracket4 - bracket3) * 0.28 +
                    (bracket5 - bracket4) * 0.33 + (taxableIncome - bracket5) * 0.35;
        }
        return tax;
    }
}