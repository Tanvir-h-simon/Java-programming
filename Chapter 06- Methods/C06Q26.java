public class C06Q26 {
    public static void main(String[] args) {
        System.out.println("The list of 100 palindromic prime numbers: ");
        int count = 0; // Count of palindromic primes found
        int number = 2; // Start checking from the first prime number

        // Continue until we've found 100 palindromic primes
        while (count < 100) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.print(number + " ");
                count++;

                // Print a new line after every 10 numbers
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++; // Move to the next number
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // The number is prime
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        // Check if the original number and reversed number are the same
        return number == reversedNumber;
    }
}