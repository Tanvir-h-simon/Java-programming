public class C06Q29 {
    public static void main(String[] args) {
        System.out.println("Twin primes less than 1,000:");

        // Loop through numbers to find twin primes
        for (int number = 2; number < 1000; number++) {
            if (isPrime(number) && isPrime(number + 2)) {
                System.out.printf("(%d, %d)\n", number, number + 2);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible, so not prime
            }
        }
        return true; // Number is prime
    }
}
