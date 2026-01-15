import java.util.Scanner;

public class C07Q14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five integers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }


        int gcd = gcd(numbers);
        System.out.println("The GCD of the entered numbers is: " + gcd);
    }

    // Method to compute GCD of an unspecified number of integers
    public static int gcd(int... numbers) {
        int result = numbers[0]; // Start with the first number
        for (int i = 1; i < numbers.length; i++) {
            result = gcdTwo(result, numbers[i]); // Compute GCD pairwise
        }
        return result;
    }

    // Helper method to compute GCD of two numbers using the Euclidean algorithm
    private static int gcdTwo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}