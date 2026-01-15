import java.util.Scanner;
import java.util.Random;

public class C07Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Prompt the user to enter the number of balls and slots
        System.out.print("Enter the number of balls to drop: ");
        int numBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numSlots = input.nextInt();

        // Initialize an array to represent the slots
        int[] slots = new int[numSlots];

        // Simulate each ball drop
        for (int i = 0; i < numBalls; i++) {
            StringBuilder path = new StringBuilder();
            int slotPosition = 0;

            // Simulate the path of the ball
            for (int j = 0; j < numSlots - 1; j++) {
                boolean isRight = rand.nextBoolean();
                if (isRight) {
                    path.append("R");
                    slotPosition++;
                } else {
                    path.append("L");
                }
            }

            // Print the path of the ball
            System.out.println(path);

            // Increment the corresponding slot
            slots[slotPosition]++;
        }

        // Print the histogram
        System.out.println("\nFinal buildup in the slots:");
        int maxBalls = findMax(slots);
        for (int i = maxBalls; i > 0; i--) {
            for (int slot : slots) {
                if (slot >= i) {
                    System.out.print(" O ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < numSlots; i++) {
            System.out.print("---");
        }
        System.out.println();
        for (int i = 0; i < numSlots; i++) {
            System.out.printf(" %d ", i);
        }
    }

    // Helper method to find the maximum number of balls in any slot
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}