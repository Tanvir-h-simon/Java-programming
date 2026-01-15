import java.util.Scanner;

public class C05Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double highestScore = -1;
        String topStudent = "";

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine(); // Consume newline character

        for (int i = 1; i <= numberOfStudents; i++){
            System.out.print("Enter " + i + "'s student name: ");
            String name = input.nextLine();

            System.out.print("Enter " + name + "'s score: ");
            double score = input.nextDouble();
            input.nextLine(); // Consume newline character

            if(score < 0 || score >= 100){
                System.out.println("Invalid score.");
                i--; // Decrease counter to repeat this student
            } else {
                if (score > highestScore){
                    highestScore = score;
                    topStudent = name;
                }
            }
        }
        System.out.printf("The student with the highest score is " + topStudent + " with a score of " + highestScore);
    }
}