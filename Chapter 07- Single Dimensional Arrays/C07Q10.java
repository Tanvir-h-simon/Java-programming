import java.util.Scanner;

public class C07Q10 {
    public static int indexOfSmallestElement(double[] array) {
        if (array == null || array.length == 0) {
            return -1; // Return -1 for empty or null array
        }

        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        int smallestIndex = indexOfSmallestElement(numbers);
        System.out.println("Index of the smallest element: " + smallestIndex);
    }
}