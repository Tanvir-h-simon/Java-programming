public class C06Q14 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "i", "m(i)");
        System.out.println("----------------");

        for (int i = 1; i <= 901; i += 100) {
            double sum = 0.0;

            for (int k = 1; k <= i; k++) {
                sum += Math.pow(-1, k + 1) / (2 * k - 1);
            }

            double m = 4 * sum;

            System.out.printf("%-10d%-10.4f\n", i, m);
        }
    }
}