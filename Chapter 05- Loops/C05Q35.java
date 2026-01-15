public class C05Q35 {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 1; i <= 624; i++) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }

        System.out.printf("The summation result is: %.6f\n", sum);
    }
}
