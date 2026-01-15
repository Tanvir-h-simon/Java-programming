public class C05Q23 {
    public static void main(String[] args) {
        int n = 50000;

        // Summation from left to right
        double sumLeftToRight = 0.0;
        for (int i = 1; i <= n; i++) {
            sumLeftToRight += 1.0 / i;
        }

        // Summation from right to left
        double sumRightToLeft = 0.0;
        for (int i = n; i >= 1; i--) {
            sumRightToLeft += 1.0 / i;
        }

        // Display results
        System.out.println("Summation from left to right: " + sumLeftToRight);
        System.out.println("Summation from right to left: " + sumRightToLeft);
        System.out.println("Difference: " + Math.abs(sumLeftToRight - sumRightToLeft));
    }
}
