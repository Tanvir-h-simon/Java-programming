import java.util.Scanner;

public class C07Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store the 10 integers
        int[] numbers = new int[10];

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Display all combinations of picking two numbers
        System.out.println("All combinations of picking two numbers:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
            }
        }
    }
}