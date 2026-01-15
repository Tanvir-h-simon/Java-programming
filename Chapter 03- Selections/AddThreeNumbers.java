import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = (int) (Math.random() * 1000);
        int num2 = (int) (Math.random() * 1000);

        System.out.println("Sum of " + num1 + " + " + num2 + " = " + " ? ");
        int sum = scan.nextInt();

        if (sum == num1 + num2) {
            System.out.print("You are correct!");
        }
        else {
            System.out.print("You are incorrect!");
        }
    }
}