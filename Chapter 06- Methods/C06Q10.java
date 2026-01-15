public class C06Q10 {
    public static void main(String[] args) {
        int limit = 10000; // Find primes less than this value
        int count = 0; // Counter for prime numbers

        for (int number = 2; number < limit; number++) {
            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println("The number of prime numbers less than " + limit + " is: " + count);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false;
            }
        }
        return true; // Number is prime
    }
}