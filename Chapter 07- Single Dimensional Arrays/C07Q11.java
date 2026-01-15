import java.util.Scanner;

public class C07Q11{
    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double sum = 0;
        for (double num : x) {
            sum += num;
        }
        return sum / x.length;
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double mean = mean(x);
        double sumSquaredDiff = 0;

        for (double num : x) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }

        return Math.sqrt(sumSquaredDiff / (x.length - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        double mean = mean(numbers);
        double deviation = deviation(numbers);

        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standard deviation is %.5f\n", deviation);

        input.close();
    }
}