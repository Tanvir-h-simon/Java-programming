import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Generate two random numbers 0–9
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int correctAnswer = number1 + number2;

        ArrayList<Integer> previousAnswers = new ArrayList<>();

        int userAnswer;

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        while (true) {
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("You got it!");
                break;  // correct, exit loop
            } else {
                if (previousAnswers.contains(userAnswer)) {
                    System.out.println("You already entered " + userAnswer);
                } else {
                    System.out.println("Wrong answer. Try again.");
                    previousAnswers.add(userAnswer); // store the wrong answer
                }
                System.out.print("What is " + number1 + " + " + number2 + "? ");
            }
        }
    }
}