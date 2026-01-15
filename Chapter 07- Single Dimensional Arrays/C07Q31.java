import java.util.Scanner;

public class C07Q31 {

    // Method to merge two sorted arrays into a single sorted array
    public static int[] merge(int[] list1, int[] list2) {
        // Create an array to store the merged result
        int[] mergedList = new int[list1.length + list2.length];

        // Pointers for list1, list2, and mergedList
        int i = 0, j = 0, k = 0;

        // Merge the two lists
        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) {
                mergedList[k++] = list1[i++];
            } else {
                mergedList[k++] = list2[j++];
            }
        }

        // Copy remaining elements from list1, if any
        while (i < list1.length) {
            mergedList[k++] = list1[i++];
        }

        // Copy remaining elements from list2, if any
        while (j < list2.length) {
            mergedList[k++] = list2[j++];
        }

        return mergedList;
    }

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner input = new Scanner(System.in);

        // Prompt user for the first sorted list
        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        // Prompt user for the second sorted list
        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        // Merge the two sorted lists
        int[] mergedList = merge(list1, list2);

        // Print the merged list
        System.out.print("The merged list is: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}