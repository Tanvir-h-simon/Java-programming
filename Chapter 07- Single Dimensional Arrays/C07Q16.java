import java.util.Arrays;

public class C07Q16{
    public static void main(String[] args) {
        // Generate an array of 100,000 random integers
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            // Random integers between 0 and 99,999
            array[i] = (int) (Math.random() * 100000);
        }

        // Generate a random key to search for
        int key = (int) (Math.random() * 100000);

        // Measure execution time of linear search
        long startTime = System.currentTimeMillis();
        int linearResult = linearSearch(array, key);
        long endTime = System.currentTimeMillis();
        long linearExecutionTime = endTime - startTime;

        System.out.println("Linear Search Result: " + linearResult);
        System.out.println("Linear Search Execution Time: " + linearExecutionTime + " milliseconds");

        // Sort the array for binary search
        Arrays.sort(array);

        // Measure execution time of binary search
        startTime = System.currentTimeMillis();
        int binaryResult = binarySearch(array, key);
        endTime = System.currentTimeMillis();
        long binaryExecutionTime = endTime - startTime;

        System.out.println("Binary Search Result: " + binaryResult);
        System.out.println("Binary Search Execution Time: " + binaryExecutionTime + " milliseconds");
    }

    // Linear search method
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Binary search method
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}