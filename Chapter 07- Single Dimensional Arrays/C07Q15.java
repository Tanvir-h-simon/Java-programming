import java.util.Scanner;

public class C07Q15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Call the method to eliminate duplicates
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Display the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length]; // Temporary array for distinct numbers
        int distinctCount = 0; // Count of distinct numbers

        for (int k : list) {
            boolean isDuplicate = false;

            // Check if the current number is already in the temp array
            for (int j = 0; j < distinctCount; j++) {
                if (k == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the temp array
            if (!isDuplicate) {
                temp[distinctCount] = k;
                distinctCount++;
            }
        }

        // Create the result array with the exact size of distinct elements
        int[] result = new int[distinctCount];
        System.arraycopy(temp, 0, result, 0, distinctCount);

        return result;
    }
}