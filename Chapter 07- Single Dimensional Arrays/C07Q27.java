import java.util.Scanner;

public class C07Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first list
        System.out.print("Enter list1: ");
        int[] list1 = readList(input);

        // Prompt the user to enter the second list
        System.out.print("Enter list2: ");
        int[] list2 = readList(input);

        // Check if the two lists are identical
        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }
    }

    /**
     * Reads a list of integers from the user input.
     *
     * @param input The Scanner object for reading user input.
     * @return The array of integers representing the list.
     */
    public static int[] readList(Scanner input) {
        // Read the number of elements in the list
        int size = input.nextInt();

        // Create an array to store the list elements
        int[] list = new int[size];

        // Read the elements of the list
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        return list;
    }

    /**
     * Checks if two lists are identical (i.e., they contain the same elements in the same order).
     *
     * @param list1 The first list to compare.
     * @param list2 The second list to compare.
     * @return true if the lists are identical, false otherwise.
     */
    public static boolean equals(int[] list1, int[] list2) {
        // If the lengths are not the same, they are not identical
        if (list1.length != list2.length) {
            return false;
        }

        // Check if all corresponding elements are equal
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        // If all elements are equal, return true
        return true;
    }
}