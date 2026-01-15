public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static void main(String[] args) {
        final int LIMIT = 120;
        StackOfIntegers stack = new StackOfIntegers();

        // Find all prime numbers less than LIMIT
        for (int i = 2; i < LIMIT; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }

        // Display all prime numbers in decreasing order
        System.out.println("Prime numbers less than " + LIMIT + " in decreasing order:");
        int stackSize = stack.getSize();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}