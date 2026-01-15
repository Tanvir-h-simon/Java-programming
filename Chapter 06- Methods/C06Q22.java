public class C06Q22 {
    public static double sqrt(long n) {
        double lastGuess = 1.0; // Initial guess
        double nextGuess = (lastGuess + n / lastGuess) / 2.0;

        // Loop until the difference between guesses is less than 0.0001
        while (Math.abs(nextGuess - lastGuess) >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
        }
        return nextGuess;
    }

    public static void main(String[] args) {
        // Test the method with different numbers
        long[] testNumbers = {4, 16, 25, 50, 100, 123456789};

        for (long number : testNumbers) {
            System.out.printf("The square root of %d is approximately %.5f%n", number, sqrt(number));
        }
    }
}
