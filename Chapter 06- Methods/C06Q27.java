public class C06Q27 {
    public static void main(String[] args) {
        System.out.println("The list of the first 100 emirps:");
        int count = 0; // Count of emirps found
        int number = 2; // Start checking from the first prime number

        // Continue until we've found 100 emirps
        while (count < 100) {
            if (isPrime(number) && !isPalindrome(number) && isPrime(reverseNumber(number))) {
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
        return number == reverseNumber(number);
    }

    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}