public class ApproximatePi {
    public static void main(String[] args) {
        double x = 4 * (1.0- 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double y = 4 * (1.0- 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        System.out.println("Approximation of pi using 6 terms: " + x);
        System.out.println("Approximation of pi using 7 terms: " + y);
    }
}
