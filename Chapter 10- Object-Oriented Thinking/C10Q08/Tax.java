public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        // Default values
        filingStatus = SINGLE_FILER;
        brackets = new int[4][4];
        rates = new double[4];
        taxableIncome = 0;
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;

        if (taxableIncome <= 0) {
            return 0;
        }

        // Calculate tax based on filing status and income
        if (taxableIncome <= brackets[filingStatus][0]) {
            // Income falls in the first bracket
            tax = taxableIncome * rates[0];
        } else {
            // Tax for first bracket
            tax = brackets[filingStatus][0] * rates[0];

            // Tax for intermediate brackets
            for (int i = 1; i < brackets[filingStatus].length; i++) {
                if (taxableIncome > brackets[filingStatus][i]) {
                    tax += (brackets[filingStatus][i] - brackets[filingStatus][i-1]) * rates[i];
                } else {
                    tax += (taxableIncome - brackets[filingStatus][i-1]) * rates[i];
                    return tax; // Exit once we've calculated the tax
                }
            }

            // Tax for the amount above the highest bracket
            tax += (taxableIncome - brackets[filingStatus][brackets[filingStatus].length-1]) *
                    rates[rates.length-1];
        }

        return tax;
    }
}