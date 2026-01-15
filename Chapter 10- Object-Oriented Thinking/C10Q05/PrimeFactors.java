import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        System.out.print("The smallest factors of " + number + " in decreasing order are: ");

        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2; // Start with the smallest factor
        while (factor <= number) {
            if (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }

        // Display the factors in decreasing order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) {
                System.out.print(", ");
            }
        }
        input.close();
    }
}