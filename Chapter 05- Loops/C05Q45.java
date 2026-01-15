import java.util.Scanner;

public class C05Q45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the sum and standard deviation calculation
        double sum = 0;
        double sumOfSquares = 0;

        // Prompt the user to enter 10 numbers
        System.out.println("Enter ten numbers:");

        // Loop to get 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            double num = scanner.nextDouble();
            sum += num;  // Add the number to the sum
            sumOfSquares += num * num;  // Add the square of the number to sumOfSquares
        }

        // Calculate the mean
        double mean = sum / 10;

        // Calculate the variance and standard deviation
        double variance = sumOfSquares / 10 - (mean * mean);
        double standardDeviation = Math.sqrt(variance);

        // Display the results
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + standardDeviation);
    }
}
