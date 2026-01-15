import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);

        int addition = num1 + num2;
        int subtraction = num1 - num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
    }
}
