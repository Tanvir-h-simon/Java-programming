import java.util.Scanner;

public class C07Q32 {

    // Method to partition the list using the first element as the pivot
    public static int partition(int[] list) {
        int pivot = list[0]; // Choose the first element as pivot
        int low = 1;  // Start from the second element
        int high = list.length - 1;

        while (low <= high) {
            // Move low to the right while the element is less than or equal to the pivot
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            // Move high to the left while the element is greater than the pivot
            while (low <= high && list[high] > pivot) {
                high--;
            }

            // If low is still less than or equal to high, swap the elements
            if (low < high) {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }

        // Swap the pivot element with the element at high to place it in the correct position
        list[0] = list[high];
        list[high] = pivot;

        return high;  // Return the index of the pivot
    }

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner input = new Scanner(System.in);

        // Prompt user for the list
        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        // Perform the partition
        int pivotIndex = partition(list);

        // Print the list after partitioning
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        // Print the index of the pivot
        System.out.println("Pivot index: " + pivotIndex);
    }
}