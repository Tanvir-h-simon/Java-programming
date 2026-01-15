public class Main {
    public static void main(String[] args) {
        // Define tax brackets for 2001
        int[][] brackets2001 = {
                // Brackets for single filers
                {27050, 65550, 136750, 297350},
                // Brackets for married filing jointly
                {45200, 109250, 166500, 297350},
                // Brackets for married filing separately
                {22600, 54625, 83250, 148675},
                // Brackets for head of household
                {36250, 93650, 151650, 297350}
        };

        // Define tax rates for 2001
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

        // Define tax brackets for 2009
        int[][] brackets2009 = {
                // Brackets for single filers
                {8350, 33950, 82250, 171550, 372950},
                // Brackets for married filing jointly
                {16700, 67900, 137050, 208850, 372950},
                // Brackets for married filing separately
                {8350, 33950, 68525, 104425, 186475},
                // Brackets for head of household
                {11950, 45500, 117450, 190200, 372950}
        };

        // Define tax rates for 2009
        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Print header for 2001 tax tables
        System.out.println("2001 Tax Tables");
        System.out.println("Taxable Income | Single Filer | Married Jointly | Married Separately | Head of Household");
        System.out.println("----------------------------------------------------------------------------");

        // Create tax instance for 2001
        Tax tax2001 = new Tax();
        tax2001.setBrackets(brackets2001);
        tax2001.setRates(rates2001);

        // Print tax table for 2001 for income from $50,000 to $60,000
        for (int income = 50000; income <= 60000; income += 1000) {
            System.out.printf("$%,d | ", income);

            // Calculate tax for each filing status
            for (int status = 0; status <= 3; status++) {
                tax2001.setFilingStatus(status);
                tax2001.setTaxableIncome(income);
                System.out.printf("$%,.2f | ", tax2001.getTax());
            }
            System.out.println();
        }

        // Print header for 2009 tax tables
        System.out.println("\n\n2009 Tax Tables");
        System.out.println("Taxable Income | Single Filer | Married Jointly | Married Separately | Head of Household");
        System.out.println("----------------------------------------------------------------------------");

        // Create tax instance for 2009
        Tax tax2009 = new Tax();
        tax2009.setBrackets(brackets2009);
        tax2009.setRates(rates2009);

        // Print tax table for 2009 for income from $50,000 to $60,000
        for (int income = 50000; income <= 60000; income += 1000) {
            System.out.printf("$%,d | ", income);

            // Calculate tax for each filing status
            for (int status = 0; status <= 3; status++) {
                tax2009.setFilingStatus(status);
                tax2009.setTaxableIncome(income);
                System.out.printf("$%,.2f | ", tax2009.getTax());
            }
            System.out.println();
        }
    }
}