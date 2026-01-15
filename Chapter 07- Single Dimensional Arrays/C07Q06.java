public class C07Q06 {
    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 50;
        int[] primes = new int[NUMBER_OF_PRIMES];
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are:");

        while (count < NUMBER_OF_PRIMES) {
            // Check if the number is prime
            boolean isPrime = true;
            for (int i = 0; i < count; i++) {
                if (number % primes[i] == 0) {
                    isPrime = false; // Not a prime
                    break;
                }
                if (primes[i] * primes[i] > number) {
                    break;
                }
            }

            if (isPrime) {
                primes[count] = number;
                count++;
            }
            number++;
        }

        // Display the prime numbers, 10 per line
        for (int i = 0; i < primes.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println(); // New line after every 10 numbers
            }
            System.out.print(primes[i] + " ");
        }
    }
}