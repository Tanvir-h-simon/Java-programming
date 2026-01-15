import java.util.Scanner;

public class C05Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double highestScore = -1;
        String topStudent = "";

        double secondHighestScore = -1;
        String secondTopStudent = "";

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine(); // Consume newline character

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter " + i + "'s student name: ");
            String name = input.nextLine();

            System.out.print("Enter " + name + "'s score: ");
            double score = input.nextDouble();
            input.nextLine(); // Consume newline character

            if (score < 0 || score >= 100) {
                System.out.println("Invalid score.");
                i--; // Decrease counter to repeat this student
            } else {
                if (score > highestScore) {  // If the current score is higher than the highest score:
                    secondHighestScore = highestScore; // Move the current highest score to the second-highest position
                    secondTopStudent = topStudent;

                    // Update the highest score and the top student
                    highestScore = score;
                    topStudent = name;
                }
                else if (score > secondHighestScore) { // If the current score is not higher than the highest score, but it is higher than the second-highest score:
                    secondHighestScore = score; // Update the second-highest score and the second top student
                    secondTopStudent = name;
                }
            }
        }
        System.out.println("The student with the highest score is " + topStudent + " with a score of " + highestScore);
        System.out.println("The student with the highest score is " + secondTopStudent + " with a score of " + secondHighestScore);
    }
}