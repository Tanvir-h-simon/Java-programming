import java.util.Scanner;

public class C06Q02 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Write a number: ");
        long number = input.nextInt();

        // Call the sumDigits method and store the result
        int sum = sumDigits(number);

        System.out.println("\nSum the digit of the integer is " + sum);
    }

    public static int sumDigits(long number){
        int sum = 0;
        while (number > 0){
            // Finding the last digit of the number
            int digit = (int) number % 10;
            System.out.print(digit + " ");
            sum += digit;
            // Remove the last digit after finding and printing
            number /= 10;
        }
        return sum;
    }
}