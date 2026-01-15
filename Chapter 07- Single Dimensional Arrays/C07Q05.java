import java.util.Arrays;
import java.util.Scanner;

public class C07Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[10];
        int count = 0;

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
        }

        // Display the original number array
        /* System.out.print("Number array: ");
        for (int e : num){
            System.out.print(e + " ");
        }
        System.out.println();*/
        System.out.println("Number array: " + Arrays.toString(num));

        // Determine unique number and create a new sized array
        int size = 0; // Final (Distinct number) array size
        for (int i = 0; i < num.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (num[i] == num[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If it's distinct, keep it in the array
            if (!isDuplicate){
                num[size] = num[i]; // Store unique value
                size++;
                count++;
            }
        }

        // Create a final array with distinct numbers
        int[] finalUniqueNumArray = Arrays.copyOf(num, size);
        /* for (int i = 0; i < num.length; i++){
                    finalUniqueNumArray[i] = num[i];
        }*/

        System.out.println("Total distinct numbers are = " + count);

        // Display distinct numbers
        // System.out.println("Unique numbers: " + Arrays.toString(finalUniqueNumArray));
        System.out.print("Unique numbers: ");
        for (int element : finalUniqueNumArray) {
            System.out.print(element + " ");
        }
    }
}