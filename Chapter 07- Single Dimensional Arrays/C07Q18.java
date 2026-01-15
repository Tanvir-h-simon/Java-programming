import java.util.Scanner;

public class C07Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to hold 10 double numbers
        double[] numbers = new double[10];

        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Call the bubble sort method
        bubbleSort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }

        input.close();
    }

    // Bubble sort method
    public static void bubbleSort(double[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Swap the elements
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true; // Mark that a swap occurred
                }
            }
        } while (swapped); // Continue until no swaps are made
    }
}