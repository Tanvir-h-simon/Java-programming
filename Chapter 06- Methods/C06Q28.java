public class C06Q28 {
    public static void main(String[] args) {
        System.out.printf("%-5s%-10s\n", "p", "2^p - 1");
        System.out.println("------------------");

        // Iterate through values of p from 2 to 31
        for (int p = 2; p <= 31; p++) {
            long mersenne = (long) Math.pow(2, p) - 1; // Calculate 2^p - 1

            // Check if the result is a prime number
            if (isPrime(mersenne)) {
                System.out.printf("%-5d%-10d\n", p, mersenne);
            }
        }
    }

    public static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
}
