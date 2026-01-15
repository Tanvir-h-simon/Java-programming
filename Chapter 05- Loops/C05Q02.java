import java.util.Scanner;
public class C05Q02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = 1 + (int) (Math.random() * 15);
            int number2 = 1 + (int) (Math.random() * 15);

            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1
                        + " + " + number2 + " should be " + (number1 + number2));
            }

            count++;
            output += "\n" + number1 + " + " + number2 + " = " + answer +
                    ((number1 + number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = (endTime - startTime) / 1000;

        System.out.println("\nCorrect count is " + correctCount);
        System.out.println("Test time is " + testTime + " seconds");
        System.out.println(output);
    }
}