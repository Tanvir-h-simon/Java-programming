import java.util.Scanner;

public class C07Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100];
        int count = 0;  // Count of valid scores
        int total = 0;  // Sum of all scores

        System.out.println("Enter scores (negative number to end):");

        while (true) {
            int score = input.nextInt();


            if (score < 0) {
                break;
            }

            if (count < 100) {
                scores[count] = score;
                total += score;
                count++;
            } else {
                System.out.println("Maximum number of scores (100) reached.");
                break;
            }
        }

        // If no scores were entered, exit
        if (count == 0) {
            System.out.println("No scores entered.");
            return;
        }

        double average = (double) total / count;

        int aboveOrEqual = 0;
        int below = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        System.out.printf("The average score is %.2f%n", average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqual);
        System.out.println("Number of scores below the average: " + below);
    }
}
