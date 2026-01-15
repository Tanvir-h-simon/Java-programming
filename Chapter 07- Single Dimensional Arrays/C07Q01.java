import java.util.Scanner;

public class C07Q01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int size = input.nextInt();

        int[] scores = new int[size];

        int best = 0;

        // Prompt user to enter scores
        System.out.println("Enter " + size + " scores: ");
        for (int i = 0; i < size; i++) {
            scores[i] = input.nextInt();

            // Determine the best score
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        // Display scores and grades
        for (int i = 0; i < size; i++) {
            String grade;

            // Assign grades based on the given criteria
            if (scores[i] >= best - 10) {
                grade = "A";
            } else if (scores[i] >= best - 20) {
                grade = "B";
            } else if (scores[i] >= best - 30) {
                grade = "C";
            } else if (scores[i] >= best - 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Display the result for each student
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
}

