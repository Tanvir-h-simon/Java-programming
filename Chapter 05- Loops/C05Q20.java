public class C05Q20 {
    public static void main(String[] args) {

        int count = 0;

        for (int number = 2; number <= 1000; number++) {
            int divisor;

            // Check divisibility up to the square root of the number
            for (divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    break;  // Exit loop if the number is not prime
                }
            }

            // If the loop completes without breaking, the number is prime
            if (divisor > Math.sqrt(number)) {
                System.out.printf("%-4d", number);
                count++;

                // Print 8 prime numbers per line
                if (count % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }
}