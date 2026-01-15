import java.util.Scanner;

public class C06Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call the reverse method and store the result
        int reversedNumber = reverse(number);

        System.out.println("The reverse number is: " + reversedNumber);
    }

    public static int reverse (int number){
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        // Return the reversed number
        return reverse;
    }
}
