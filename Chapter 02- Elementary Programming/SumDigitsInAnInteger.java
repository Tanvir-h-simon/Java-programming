import java.util.Scanner;

public class SumDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 999: ");
        int number = scan.nextInt();

        int thirdDigit = number % 10;
        int firstSecondDigit = number / 10;
        int secondDigit = firstSecondDigit % 10;
        int firstDigit = number / 100;


        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println("The sum of the digits is: " + sum);
    }
}
