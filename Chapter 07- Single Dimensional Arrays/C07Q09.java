import java.util.Scanner;

public class C07Q09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble();
        }

        double minValue = min(numbers);
        System.out.printf("The minimum number is: %.1f%n", minValue);
    }

    public static double min(double[] array) {
        double minValue = Double.MAX_VALUE;
        for (double value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}